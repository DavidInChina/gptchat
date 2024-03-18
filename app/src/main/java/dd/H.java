package Dd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class H extends Enum<H> {
    public static final G Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f3511Y = R4.b.C1(EnumC3958h.f36152Y, F.f3510Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final H f3512Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final H f3513h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final H f3514i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final H f3515j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final H f3516k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ H[] f3517l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Dd.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Dd.H] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Dd.H] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Dd.H] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Dd.H] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Dd.H] */
    static {
        ?? r52 = new Enum("StartListeningIntently", 0);
        f3512Z = r52;
        ?? r62 = new Enum("StopListeningIntently", 1);
        f3513h0 = r62;
        ?? r72 = new Enum("HaltAllActivity", 2);
        f3514i0 = r72;
        ?? r82 = new Enum("ResumeListening", 3);
        f3515j0 = r82;
        ?? r92 = new Enum("RelayMessage", 4);
        f3516k0 = r92;
        H[] hArr = {r52, r62, r72, r82, r92};
        f3517l0 = hArr;
        AbstractC3557B.C0(hArr);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f3517l0.clone();
    }
}
