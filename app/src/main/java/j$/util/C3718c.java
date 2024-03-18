package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3718c implements java.util.Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35252a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f35253b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f35254c;

    public /* synthetic */ C3718c(java.util.Comparator comparator, Object obj, int i10) {
        this.f35252a = i10;
        this.f35253b = comparator;
        this.f35254c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f35252a;
        java.util.Comparator comparator = this.f35253b;
        Object obj3 = this.f35254c;
        switch (i10) {
            case 0:
                java.util.Comparator comparator2 = (java.util.Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
