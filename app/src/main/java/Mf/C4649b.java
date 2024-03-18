package mf;

import id.AbstractC3557B;
import j$.util.Comparator;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: mf.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4649b implements Comparator, j$.util.Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4649b f39278Y = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        AbstractC3557B.c0("a", comparable);
        AbstractC3557B.c0("b", comparable2);
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        return C4648a.f39277Y;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return Objects.requireNonNull(comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Objects.requireNonNull(toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
