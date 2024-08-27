/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sales.selenium.liferaycity.gartner;

import com.liferay.sales.selenium.api.DriverInitializer;

/**
 * @author Riccardo Ferrari
 */
public class LiferayCityGartnerClickpath5 extends BaseLiferayCityGartnerClickpath {

	public LiferayCityGartnerClickpath5(
		DriverInitializer di, String baseUrl) {
		super(di, baseUrl);
	}

	@Override
	public void run(String username, String password) {
		initSession(username, password);

		if (getChance(1.0)) {
			doClickText("NEWS");
			sleep(1000);
			doClickRandomText(NEWS_LINKS_TEXTS);

			if (getChance(0.6)) {
				doClickText("NEWS");
				sleep(1000);
				doClickRandomText(NEWS_LINKS_TEXTS_KID);
			}
		}

		sleep(4000);

		doClickText("CITIZEN AREA");
		sleep(1000);

		if (getChance(0.3)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(DIVERSITY);
		}
		if (getChance(0.7)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(MENTAL);
		}

		if (getChance(0.5)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(CARS);
		}
		if (getChance(0.6)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(SAFETY);
		}
		if (getChance(0.7)) {
			doClickText("My Services");
			sleep(3000);
			doClickRandomText(STREETS);
		}

		if (getChance(0.5)) {
			doClickText("Documents & More");
			sleep(3000);
			doClickRandomText(DOCUMENTS_TRANSPORT);

		}

		sleep(5000);
		quit();
	}
}
