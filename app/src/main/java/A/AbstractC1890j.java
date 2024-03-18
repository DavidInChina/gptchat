package a;

import java.io.Serializable;
import java.util.Vector;

/* renamed from: a.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC1890j extends Serializable, Cloneable {
    Vector getAttributes(boolean z10);

    Vector getBandwidths(boolean z10);

    AbstractC1881a getConnection();

    Vector getEmails(boolean z10);

    AbstractC1883c getInfo();

    AbstractC1884d getKey();

    Vector getMediaDescriptions(boolean z10);

    AbstractC1886f getOrigin();

    Vector getPhones(boolean z10);

    AbstractC1891k getSessionName();

    Vector getTimeDescriptions(boolean z10);

    AbstractC1893m getURI();

    AbstractC1894n getVersion();

    Vector getZoneAdjustments(boolean z10);
}
