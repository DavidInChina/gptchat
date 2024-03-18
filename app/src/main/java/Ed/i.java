package Ed;

import ah.AbstractC1998i;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import qf.C5323a;
import zd.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class i extends Enum<i> {
    public static final h Companion = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public static final AbstractC3957g f4674i0 = R4.b.C1(EnumC3958h.f36152Y, g.f4673Y);

    /* renamed from: j0  reason: collision with root package name */
    public static final i f4675j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final i f4676k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final i f4677l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final i f4678m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final i f4679n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ i[] f4680o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f4681p0;

    /* renamed from: Y  reason: collision with root package name */
    public final q f4682Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f4683Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f4684h0;

    /* JADX WARN: Type inference failed for: r0v6, types: [Ed.h, java.lang.Object] */
    static {
        i iVar = new i("Sky", 0, q.f51996h0, R.string.voice_name_sky, R.raw.sky);
        f4675j0 = iVar;
        i iVar2 = new i("Ember", 1, q.f51997i0, R.string.voice_name_ember, R.raw.ember);
        f4676k0 = iVar2;
        i iVar3 = new i("Breeze", 2, q.f51998j0, R.string.voice_name_breeze, R.raw.breeze);
        f4677l0 = iVar3;
        i iVar4 = new i("Juniper", 3, q.f51999k0, R.string.voice_name_juniper, R.raw.juniper);
        f4678m0 = iVar4;
        i iVar5 = new i("Cove", 4, q.f52000l0, R.string.voice_name_cove, R.raw.cove);
        f4679n0 = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f4680o0 = iVarArr;
        f4681p0 = AbstractC3557B.C0(iVarArr);
    }

    public i(String str, int i10, q qVar, int i11, int i12) {
        this.f4682Y = qVar;
        this.f4683Z = i11;
        this.f4684h0 = i12;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f4680o0.clone();
    }
}
