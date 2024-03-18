package Jc;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class E extends Enum<E> {
    public static final D Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f9039Y = R4.b.C1(EnumC3958h.f36152Y, C.f9038Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final E f9040Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final E f9041h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final E f9042i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final E f9043j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ E[] f9044k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Jc.D] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Jc.E, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Jc.E, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Jc.E, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Jc.E, java.lang.Enum] */
    static {
        ?? r42 = new Enum("AceUpload", 0);
        f9040Z = r42;
        ?? r52 = new Enum("MyFiles", 1);
        f9041h0 = r52;
        ?? r62 = new Enum("Multimodal", 2);
        f9042i0 = r62;
        ?? r72 = new Enum("DalleAgent", 3);
        f9043j0 = r72;
        E[] eArr = {r42, r52, r62, r72};
        f9044k0 = eArr;
        AbstractC3557B.C0(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f9044k0.clone();
    }
}
