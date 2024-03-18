package kg;

import Jf.p;
import Mf.AbstractC0994c;

/* renamed from: kg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4292d implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37499Y;

    public /* synthetic */ C4292d(int i10) {
        this.f37499Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f37499Y) {
            case 0:
                return C4294f.d((String) obj);
            case 1:
                return (AbstractC0994c) obj;
            case 2:
                return (AbstractC0994c) obj;
            case 3:
                return ((Ag.i) obj).f855b.mo122invoke();
            default:
                C4291c c4291c = (C4291c) obj;
                if (c4291c != null) {
                    return Boolean.valueOf(!c4291c.equals(p.f9192y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
