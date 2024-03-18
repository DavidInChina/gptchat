package jh;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4038l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4038l f36467Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4038l f36468Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4038l f36469h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC4038l f36470i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4038l[] f36471j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.l] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.l] */
    static {
        ?? r42 = new Enum(TokenNames.REGISTER, 0);
        f36467Y = r42;
        ?? r52 = new Enum("AVAILABILITY", 1);
        f36468Z = r52;
        ?? r62 = new Enum("ASSIGNMENT", 2);
        f36469h0 = r62;
        ?? r72 = new Enum("MESSAGE_NOT_SET", 3);
        f36470i0 = r72;
        f36471j0 = new EnumC4038l[]{r42, r52, r62, r72};
    }

    public static EnumC4038l valueOf(String str) {
        return (EnumC4038l) Enum.valueOf(EnumC4038l.class, str);
    }

    public static EnumC4038l[] values() {
        return (EnumC4038l[]) f36471j0.clone();
    }
}
