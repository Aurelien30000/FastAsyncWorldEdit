package com.boydti.fawe;

import com.boydti.fawe.beta.implementation.QueueHandler;
import com.boydti.fawe.object.FaweCommand;
import com.boydti.fawe.object.FawePlayer;
import com.boydti.fawe.regions.FaweMaskManager;
import com.boydti.fawe.util.TaskManager;
import com.boydti.fawe.util.image.ImageViewer;
import com.sk89q.worldedit.world.World;

import java.io.File;
import java.util.Collection;
import java.util.UUID;

public interface IFawe {

    void debug(final String s);

    File getDirectory();

    void setupCommand(final String label, final FaweCommand cmd);

    FawePlayer wrap(final Object obj);

    void setupVault();

    TaskManager getTaskManager();

    String getWorldName(World world);

    Collection<FaweMaskManager> getMaskManagers();

    void startMetrics();

    default ImageViewer getImageViewer(FawePlayer player) {
        return null;
    }

    default int getPlayerCount() {
        return Fawe.get().getCachedPlayers().size();
    }

    String getPlatformVersion();

    boolean isOnlineMode();

    String getPlatform();

    UUID getUUID(String name);

    String getName(UUID uuid);

    Object getBlocksHubApi();

    default String getDebugInfo() {
        return "";
    }

    QueueHandler getQueueHandler();

}
