package net.runelite.client.plugins.fishing;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.FishingSpot;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
@Slf4j
public class Fisharound extends Plugin {

    @Getter(AccessLevel.PACKAGE)
    private final FishingSession session = new FishingSession();

    @Getter(AccessLevel.PACKAGE)
    private final Map<Integer, MinnowSpot> minnowSpots = new HashMap<>();

    @Getter(AccessLevel.PACKAGE)
    private final List<NPC> fishingSpots = new ArrayList<>();

    @Getter(AccessLevel.PACKAGE)
    private FishingSpot currentSpot;

    @Inject
    private Client client;

    @Inject
    private Notifier notifier;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private FishingConfig config;

    @Inject
    private FishingOverlay overlay;

    @Inject
    private FishingSpotOverlay spotOverlay;

    @Inject
    private FishingSpotMinimapOverlay fishingSpotMinimapOverlay;

    private boolean trawlerNotificationSent;

    @Provides
    FishingConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(FishingConfig.class);
    }

    @Override
    protected void startUp() throws Exception
    {
        System.out.println("Starting up");
    }

    @Override
    protected void shutDown() throws Exception
    {
        System.out.println("Shuting down");
    }

}
