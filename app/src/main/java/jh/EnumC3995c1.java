package jh;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.c1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3995c1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3995c1 f36410Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3995c1 f36411Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3995c1 f36412h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3995c1[] f36413i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.c1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.c1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.c1] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36410Y = r32;
        ?? r42 = new Enum(TokenNames.OPTIONS, 1);
        f36411Z = r42;
        ?? r52 = new Enum("ENCODINGOPTIONS_NOT_SET", 2);
        f36412h0 = r52;
        f36413i0 = new EnumC3995c1[]{r32, r42, r52};
    }

    public static EnumC3995c1 valueOf(String str) {
        return (EnumC3995c1) Enum.valueOf(EnumC3995c1.class, str);
    }

    public static EnumC3995c1[] values() {
        return (EnumC3995c1[]) f36413i0.clone();
    }
}
