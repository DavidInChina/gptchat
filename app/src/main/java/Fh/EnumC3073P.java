package fh;

import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: fh.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3073P extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3073P f30847h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC3073P f30848i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC3073P f30849j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC3073P f30850k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3073P[] f30851l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f30852m0;

    /* renamed from: Y  reason: collision with root package name */
    public final char f30853Y;

    /* renamed from: Z  reason: collision with root package name */
    public final char f30854Z;

    static {
        EnumC3073P enumC3073P = new EnumC3073P("OBJ", 0, '{', '}');
        f30847h0 = enumC3073P;
        EnumC3073P enumC3073P2 = new EnumC3073P("LIST", 1, '[', ']');
        f30848i0 = enumC3073P2;
        EnumC3073P enumC3073P3 = new EnumC3073P("MAP", 2, '{', '}');
        f30849j0 = enumC3073P3;
        EnumC3073P enumC3073P4 = new EnumC3073P("POLY_OBJ", 3, '[', ']');
        f30850k0 = enumC3073P4;
        EnumC3073P[] enumC3073PArr = {enumC3073P, enumC3073P2, enumC3073P3, enumC3073P4};
        f30851l0 = enumC3073PArr;
        f30852m0 = AbstractC3557B.C0(enumC3073PArr);
    }

    public EnumC3073P(String str, int i10, char c10, char c11) {
        this.f30853Y = c10;
        this.f30854Z = c11;
    }

    public static EnumC3073P valueOf(String str) {
        return (EnumC3073P) Enum.valueOf(EnumC3073P.class, str);
    }

    public static EnumC3073P[] values() {
        return (EnumC3073P[]) f30851l0.clone();
    }
}
