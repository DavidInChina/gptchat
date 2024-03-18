package t5;

/* renamed from: t5.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5677c {

    /* renamed from: a  reason: collision with root package name */
    public static final C5677c f45749a = new Object();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5677c)) {
            return false;
        }
        ((C5677c) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (((((((int) 524288) * 31) + 500) * 31) + ((int) 4194304)) * 31) + ((int) 64800000);
    }

    public final String toString() {
        return "FeatureStorageConfiguration(maxItemSize=524288, maxItemsPerBatch=500, maxBatchSize=4194304, oldBatchThreshold=64800000)";
    }
}
