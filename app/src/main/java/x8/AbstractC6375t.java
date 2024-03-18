package x8;

/* renamed from: x8.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6375t implements b0 {

    /* renamed from: Y  reason: collision with root package name */
    public transient C6365i f49611Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient C6374s f49612Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient C6363g f49613h0;

    public abstract C6363g a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return ((AbstractC6359c) this).a().equals(((AbstractC6359c) ((b0) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f49560h0.hashCode();
    }

    public final String toString() {
        return a().f49560h0.toString();
    }
}
