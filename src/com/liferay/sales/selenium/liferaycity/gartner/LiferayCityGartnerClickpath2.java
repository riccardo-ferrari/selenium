/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sales.selenium.liferaycity.gartner;

import com.liferay.sales.selenium.api.DriverInitializer;

/**
 * @author Riccardo Ferrari
 */
public class LiferayCityGartnerClickpath2 extends BaseLiferayCityGartnerClickpath {

	public LiferayCityGartnerClickpath2(
		DriverInitializer di, String baseUrl) {
		super(di, baseUrl);
	}

	@Override
	public void run(String username, String password) {
		initSession(username, password);

		sleep(4000);

		doClickText("CITIZEN AREA");
		sleep(1000);

		if (getChance(0.7)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(BUSINESS);
		}
		if (getChance(0.3)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(NEW_AND_MODERN_BUSINESS);
		}

		if (getChance(0.8)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(CARS);
		}
		if (getChance(0.2)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(SAFETY);
		}
		if (getChance(0.6)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(PAYMENTS_BUSINESS);
		}
		if (getChance(0.1)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(PROPERTY);
		}

		if (getChance(0.3)) {
			doClickText("Documents & More");
			sleep(3000);
			doClickRandomText(DOCUMENTS_BUSINESS);

		}
		if (getChance(0.1)) {
			doClickText("Documents & More");
			sleep(3000);
			doClickRandomText(DOCUMENTS_BUSINESS);
		}

		sleep(5000);
		quit();
	}
}
