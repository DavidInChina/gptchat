package Df;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class A extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final A f3618Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final A f3619Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final A f3620h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ A[] f3621i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Df.A] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Df.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Df.A] */
    static {
        ?? r32 = new Enum("INVARIANT", 0);
        f3618Y = r32;
        ?? r42 = new Enum(SDPKeywords.IN, 1);
        f3619Z = r42;
        ?? r52 = new Enum("OUT", 2);
        f3620h0 = r52;
        A[] aArr = {r32, r42, r52};
        f3621i0 = aArr;
        AbstractC3557B.C0(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f3621i0.clone();
    }
}
