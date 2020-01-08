package mate.academy.internetshop.model;

import java.util.List;

public class Bucket {
    private List<Item> items;
    private Long bucketId;
    private Long ownerId;

    public Long getOwnerID() {
        return ownerId;
    }

    public void setOwnerId(Long id) {
        this.ownerId = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getBucketId() {
        return bucketId;
    }

    public void setBucketId(Long bucketId) {
        this.bucketId = bucketId;
    }
}