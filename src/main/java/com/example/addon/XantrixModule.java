package com.example.addon.hacks;

import net.wurstclient.hack.Hack;
import net.wurstclient.settings.CheckboxSetting;
import net.wurstclient.util.ChatUtils;

public final class XantrixModule extends Hack
{
    private final CheckboxSetting announceToggle =
        new CheckboxSetting(
            "Announce toggle",
            "Print a chat message when Xantrix is toggled.",
            true);

    public XantrixModule()
    {
        super("Xantrix", "Xantrix custom addon module.", false);
        setCategory("Xantrix");
        addSetting(announceToggle);
    }

    @Override
    protected void onEnable()
    {
        if(announceToggle.isChecked())
            ChatUtils.message("[Xantrix] Enabled.");
    }

    @Override
    protected void onDisable()
    {
        if(announceToggle.isChecked())
            ChatUtils.message("[Xantrix] Disabled.");
    }
}