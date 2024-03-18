package nd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: nd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4814c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4814c f40282Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4814c f40283Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4814c f40284h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4814c[] f40285i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, nd.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, nd.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, nd.c] */
    static {
        ?? r32 = new Enum("Analytics", 0);
        f40282Y = r32;
        ?? r42 = new Enum("Datadog", 1);
        f40283Z = r42;
        ?? r52 = new Enum("ApiHeader", 2);
        f40284h0 = r52;
        EnumC4814c[] enumC4814cArr = {r32, r42, r52};
        f40285i0 = enumC4814cArr;
        AbstractC3557B.C0(enumC4814cArr);
    }

    public static EnumC4814c valueOf(String str) {
        return (EnumC4814c) Enum.valueOf(EnumC4814c.class, str);
    }

    public static EnumC4814c[] values() {
        return (EnumC4814c[]) f40285i0.clone();
    }
}
