package dh;

import Df.AbstractC0405d;
import Df.AbstractC0406e;
import id.AbstractC3557B;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2704h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final SerialDescriptor[] f28455a = new SerialDescriptor[0];

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f28456b = new KSerializer[0];

    public static final Set a(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        if (serialDescriptor instanceof AbstractC2710l) {
            return ((AbstractC2710l) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int f6 = serialDescriptor.f();
        for (int i10 = 0; i10 < f6; i10++) {
            hashSet.add(serialDescriptor.g(i10));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return f28455a;
        }
        return serialDescriptorArr;
    }

    public static final AbstractC0405d c(Df.w wVar) {
        AbstractC3557B.c0("<this>", wVar);
        AbstractC0406e e10 = wVar.e();
        if (e10 instanceof AbstractC0405d) {
            return (AbstractC0405d) e10;
        }
        if (e10 instanceof Df.x) {
            throw new IllegalArgumentException("Captured type parameter " + e10 + " from generic non-reified function. Such functionality cannot be supported because " + e10 + " is erased, either specify serializer explicitly or make calling function inline with reified " + e10 + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + e10);
    }

    public static final void d(AbstractC0405d abstractC0405d) {
        AbstractC3557B.c0("<this>", abstractC0405d);
        String o10 = abstractC0405d.o();
        if (o10 == null) {
            o10 = "<local class name not available>";
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.A("Serializer for class '", o10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
