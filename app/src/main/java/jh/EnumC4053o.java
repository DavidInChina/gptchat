package jh;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4053o extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4053o f36522Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4053o f36523Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4053o f36524h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC4053o f36525i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC4053o f36526j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4053o[] f36527k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, jh.o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, jh.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, jh.o] */
    static {
        ?? r52 = new Enum(TokenNames.REGISTER, 0);
        f36522Y = r52;
        ?? r62 = new Enum("AVAILABILITY", 1);
        f36523Z = r62;
        ?? r72 = new Enum("STATUS", 2);
        f36524h0 = r72;
        ?? r82 = new Enum("JOB_UPDATE", 3);
        f36525i0 = r82;
        ?? r92 = new Enum("MESSAGE_NOT_SET", 4);
        f36526j0 = r92;
        f36527k0 = new EnumC4053o[]{r52, r62, r72, r82, r92};
    }

    public static EnumC4053o valueOf(String str) {
        return (EnumC4053o) Enum.valueOf(EnumC4053o.class, str);
    }

    public static EnumC4053o[] values() {
        return (EnumC4053o[]) f36527k0.clone();
    }
}
