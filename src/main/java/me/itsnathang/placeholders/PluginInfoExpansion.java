package me.itsnathang.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class PluginInfoExpansion extends PlaceholderExpansion {

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public String getAuthor() {
        return "NathanG";
    }

    @Override
    public String getIdentifier() {
        return "plugininfo";
    }

    @Override
    public String getPlugin() {
        return null;
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        String placeholder = identifier.toLowerCase();
        String pluginName  = identifier.replaceAll(".+_", "");
        Plugin plugin      = Bukkit.getServer().getPluginManager().getPlugin(pluginName);

        // Enabled & Disabled
        if (placeholder.startsWith("enabled_"))
            return String.valueOf(plugin != null && plugin.isEnabled());

        if (placeholder.startsWith("disabled_"))
            return String.valueOf(plugin != null && !plugin.isEnabled());

        if (placeholder.startsWith("exists_"))
            return String.valueOf(plugin != null);

        if (plugin == null) return null;

        // Plugin Information
        if (placeholder.startsWith("name_"))
            return plugin.getDescription().getName();

        if (placeholder.startsWith("fullname_"))
            return plugin.getDescription().getFullName();

        if (placeholder.startsWith("description_"))
            return plugin.getDescription().getDescription();

        if (placeholder.startsWith("version_"))
            return plugin.getDescription().getVersion();

        if (placeholder.startsWith("website_"))
            return plugin.getDescription().getWebsite();

        if (placeholder.startsWith("authors_"))
            return plugin.getDescription().getAuthors().toString();

        if (placeholder.startsWith("depends_"))
            return plugin.getDescription().getDepend().toString();

        if (placeholder.startsWith("softdepends_"))
            return plugin.getDescription().getSoftDepend().toString();

        if (placeholder.startsWith("permissions_"))
            return plugin.getDescription().getPermissions().toString();

        return null;
    }
}
