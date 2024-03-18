package Eh;

import wh.AbstractC6250o;
import yh.AbstractC6632q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class Y extends Enum implements Z, U {

    /* renamed from: Y  reason: collision with root package name */
    public static final V f4762Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ Y[] f4763Z;

    static {
        V v10 = new V();
        f4762Y = v10;
        f4763Z = new Y[]{v10, new Y() { // from class: Eh.W
            @Override // Eh.Z
            public final Hh.n a(AbstractC6250o abstractC6250o, AbstractC6250o abstractC6250o2, Ih.a aVar, int i10) {
                AbstractC6632q abstractC6632q;
                if (abstractC6250o.W0()) {
                    abstractC6632q = abstractC6250o.mo118a();
                } else {
                    abstractC6632q = abstractC6250o.getReturnType();
                }
                return Hh.h.h(abstractC6632q);
            }
        }, new Y() { // from class: Eh.X
            @Override // Eh.Z
            public final Hh.n a(AbstractC6250o abstractC6250o, AbstractC6250o abstractC6250o2, Ih.a aVar, int i10) {
                return Hh.m.f7819Y;
            }
        }};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f4763Z.clone();
    }
}
