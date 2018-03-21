## PluginInfo

PluginInfo is an expansion for the plugin [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) that provides information pertaining to plugins on the server.

### Installation

Simply issue the command `/papi ecloud download PluginInfo`.

Alternatively, download and drop the `Expansion-PluginInfo.jar` file into `plugins/PlaceHolderAPI/expansions` and then reload PlaceholderAPI.

### Usage

PluginInfo provides the following placeholders:

Make sure to replace `<plugin>` with the name of the plugin you would like information about. At the moment of writing, this is __case-sensitive__.

- `%plugininfo_enabled_<plugin>%` returns _true_ if plugin is enabled, _false_ if not.
- `%plugininfo_disabled_<plugin>%` returns _false_ if plugin is enabled, _true_ if not.
- `%plugininfo_exists_<plugin>%` returns _true_ if the plugin is on the server, _false__ if not.
- __Name__: `%plugininfo_name_<plugin>%`
- __Full Name__: `%plugininfo_fullname_<plugin>%`
- __Description__: `%plugininfo_description_<plugin>%`
- __Version__: `%plugininfo_version_<plugin>%`
- __Website__: `%plugininfo_website_<plugin>%`
- __Authors__: `%plugininfo_authors_<plugin>%`
- __Depends__: `%plugininfo_depends_<plugin>%`
- __Soft Depends__: `%plugininfo_softdepends_<plugin>%`
- __Permissions__: `%plugininfo_permissions_<plugin>%`

### License

PluginInfo is licensed under the MIT License. For more information please refer to the LICENSE file.
