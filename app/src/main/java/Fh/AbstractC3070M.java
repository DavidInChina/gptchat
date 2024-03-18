package fh;

import dh.C0;
import dh.F0;
import dh.I0;
import dh.z0;
import id.AbstractC3557B;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3070M {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f30843a = R4.b.X1(C0.f28384b, F0.f28392b, z0.f28514b, I0.f28400b);

    public static final boolean a(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        if (serialDescriptor.isInline() && f30843a.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}
