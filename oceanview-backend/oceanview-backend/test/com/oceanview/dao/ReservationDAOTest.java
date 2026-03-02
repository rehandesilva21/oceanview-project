package com.oceanview.dao;

import com.oceanview.model.Reservation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class ReservationDAOTest {

    private ReservationDAO reservationDAO;
    private Reservation testReservation;
    private int insertedReservationId;

    @Before
    public void setUp() throws SQLException {
        reservationDAO = new ReservationDAO();

        testReservation = new Reservation();
        testReservation.setUserId(1); 
        testReservation.setGuestName("JUnit Test Guest");
        testReservation.setGuestEmail("junit@test.com");
        testReservation.setRoomId(1);
        testReservation.setRoomName("Deluxe Room");
        testReservation.setCheckIn(new Date());
        testReservation.setCheckOut(new Date(System.currentTimeMillis() + 86400000));
        testReservation.setStatus("PENDING");
        testReservation.setAmount(5000.0);
        testReservation.setPaid(false);

        reservationDAO.addReservation(testReservation);

        // Get inserted reservation
        Reservation inserted =
                reservationDAO.getReservationByGuestName("JUnit Test Guest");
        insertedReservationId = inserted.getId();
    }

    @After
    public void tearDown() throws SQLException {
        reservationDAO.deleteReservation(insertedReservationId);
    }

    @Test
    public void testAddReservation() throws SQLException {
        assertTrue(insertedReservationId > 0);
    }

    @Test
    public void testGetReservationById() throws SQLException {
        Reservation r = reservationDAO.getReservationById(insertedReservationId);
        assertNotNull(r);
        assertEquals("JUnit Test Guest", r.getGuestName());
    }

    @Test
    public void testUpdateStatus() throws SQLException {
        boolean updated = reservationDAO.updateStatus(insertedReservationId, "CONFIRMED");
        assertTrue(updated);

        Reservation r = reservationDAO.getReservationById(insertedReservationId);
        assertEquals("CONFIRMED", r.getStatus());
    }

    @Test
    public void testMarkAsPaid() throws SQLException {
        boolean paid = reservationDAO.markAsPaid(insertedReservationId);
        assertTrue(paid);

        Reservation r = reservationDAO.getReservationById(insertedReservationId);
        assertTrue(r.isPaid());
    }

    @Test
    public void testDeleteReservation() throws SQLException {
        boolean deleted = reservationDAO.deleteReservation(insertedReservationId);
        assertTrue(deleted);
    }

    @Test
    public void testTotalReservationsCount() throws SQLException {
        int total = reservationDAO.getTotalReservations();
        assertTrue(total >= 0);
    }
}