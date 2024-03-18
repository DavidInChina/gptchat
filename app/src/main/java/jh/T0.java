package jh;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class T0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final T0 f36342Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final T0 f36343Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final T0 f36344h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ T0[] f36345i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.T0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.T0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.T0] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36342Y = r32;
        ?? r42 = new Enum(TokenNames.OPTIONS, 1);
        f36343Z = r42;
        ?? r52 = new Enum("ENCODINGOPTIONS_NOT_SET", 2);
        f36344h0 = r52;
        f36345i0 = new T0[]{r32, r42, r52};
    }

    public static T0 valueOf(String str) {
        return (T0) Enum.valueOf(T0.class, str);
    }

    public static T0[] values() {
        return (T0[]) f36345i0.clone();
    }
}
