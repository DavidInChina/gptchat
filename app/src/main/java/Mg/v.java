package mg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class v extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final v f39370Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final v f39371Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ v[] f39372h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [mg.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mg.v, java.lang.Enum] */
    static {
        ?? r32 = new Enum("RENDER_OVERRIDE", 0);
        f39370Y = r32;
        ?? r42 = new Enum("RENDER_OPEN", 1);
        f39371Z = r42;
        v[] vVarArr = {r32, r42, new Enum("RENDER_OPEN_OVERRIDE", 2)};
        f39372h0 = vVarArr;
        AbstractC3557B.C0(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f39372h0.clone();
    }
}
