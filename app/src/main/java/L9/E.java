package L9;

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
    public static final AbstractC3957g f10873Y = R4.b.C1(EnumC3958h.f36152Y, C.f10872Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final E f10874Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final E f10875h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ E[] f10876i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [L9.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, L9.E] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, L9.E] */
    static {
        ?? r32 = new Enum("Next", 0);
        f10874Z = r32;
        ?? r42 = new Enum("Variant", 1);
        f10875h0 = r42;
        E[] eArr = {r32, r42, new Enum("Continue", 2)};
        f10876i0 = eArr;
        AbstractC3557B.C0(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f10876i0.clone();
    }
}
