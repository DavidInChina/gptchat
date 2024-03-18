package ha;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ha.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3379w extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final R4.a f32083Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3379w f32084Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3379w f32085h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3379w[] f32086i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ha.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ha.w, java.lang.Enum] */
    static {
        ?? r22 = new Enum(SIPHeaderNames.ALLOW, 0);
        f32084Z = r22;
        ?? r32 = new Enum("Confirm", 1);
        f32085h0 = r32;
        EnumC3379w[] enumC3379wArr = {r22, r32};
        f32086i0 = enumC3379wArr;
        AbstractC3557B.C0(enumC3379wArr);
    }

    public static EnumC3379w valueOf(String str) {
        return (EnumC3379w) Enum.valueOf(EnumC3379w.class, str);
    }

    public static EnumC3379w[] values() {
        return (EnumC3379w[]) f32086i0.clone();
    }
}
