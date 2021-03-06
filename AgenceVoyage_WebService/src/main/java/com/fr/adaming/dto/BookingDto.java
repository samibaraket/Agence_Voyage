package com.fr.adaming.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author victor
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookingDto {

	/**
	 * @param nbrAdult
	 */
	private int nbrAdult;

	/**
	 * @param nbrChild
	 */
	private int nbrChild;

	/**
	 * @param totalPrice
	 */
	private Double totalPrice;

	/**
	 * @param pointAddFidelity
	 */
	private Long pointAddFidelity;

	/**
	 * @param id_customerDto
	 * 
	 */

	private Long idcustomerDto;

	/**
	 * @param id_travelDto
	 */

	private Long idtravelDto;

}
