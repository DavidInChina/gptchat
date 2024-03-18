package Qd;

import ah.AbstractC1998i;
import com.segment.analytics.kotlin.core.EventType$Companion;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class o extends Enum<o> {
    public static final EventType$Companion Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f14640Y = R4.b.C1(EnumC3958h.f36152Y, n.f14639Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final o f14641Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final o f14642h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final o f14643i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final o f14644j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final o f14645k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ o[] f14646l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.segment.analytics.kotlin.core.EventType$Companion] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Qd.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Qd.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Qd.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Qd.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Qd.o, java.lang.Enum] */
    static {
        ?? r52 = new Enum("Track", 0);
        f14641Z = r52;
        ?? r62 = new Enum("Screen", 1);
        f14642h0 = r62;
        ?? r72 = new Enum("Alias", 2);
        f14643i0 = r72;
        ?? r82 = new Enum("Identify", 3);
        f14644j0 = r82;
        ?? r92 = new Enum("Group", 4);
        f14645k0 = r92;
        f14646l0 = new o[]{r52, r62, r72, r82, r92};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f14646l0.clone();
    }
}
