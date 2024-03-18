package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Collectors {

    /* renamed from: a  reason: collision with root package name */
    static final Set f35400a;

    static {
        EnumC3780j enumC3780j = EnumC3780j.CONCURRENT;
        EnumC3780j enumC3780j2 = EnumC3780j.UNORDERED;
        EnumC3780j enumC3780j3 = EnumC3780j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC3780j, enumC3780j2, enumC3780j3));
        Collections.unmodifiableSet(EnumSet.of(enumC3780j, enumC3780j2));
        f35400a = Collections.unmodifiableSet(EnumSet.of(enumC3780j3));
        Collections.unmodifiableSet(EnumSet.of(enumC3780j2, enumC3780j3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC3780j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C3795m(new N0(11), new N0(12), new C3740b(1), f35400a);
    }
}
