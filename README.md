# autolicense

The Auto-License module shows a simple way to embed your Magnolia Enterprise license in a module so that you can avoid entering your license details when installing Magnolia.
This module is not intended to be used as is - there is not a valid license key in the bootstrap file - but you are welcome to use the sources to build your own auto-license module.


## Installation

DON'T INSTALL THIS MODULE WITHOUT MODIFICATION!

The bootstrap of the license key does not contain a valid license key. You should export your license key (at /config/modules/enterprise/license) or edit the module bootstrap file config.modules.enterprise.license.xml and paste in your license key.


## Usage

Once you have added your license key (see above), re-build the module and add a dependency to your Magnolia web app project and rebuild. When the Auto-License module is installed, it will add the Magnolia Enterprise license key.

Changing the license key: if your license key expires or changes, you should update the bootstrap file as described above. 

You must also increment the module version number as well, and change the dependency version in any Magnolia web projects that use the module. Changing the module version will cause the module version handler (info.magnolia.services.setup.AutoLicenseVersionHandler) to update the license key if the module has already been installed.


## Information on Magnolia CMS


## License


## Contributors

Andrew Warinner<br>
Senior Solution Architect<br>
Magnolia
