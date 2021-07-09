package com.simsilica.lemur.event;

import com.jme3.collision.CollisionResults;

import java.util.Map;

/**
 * @author Chen Jiongyu
 */
public interface PickObserver {
    void collisionResultsChanged(Map<String, CollisionResults> layerToCollisions);
}
