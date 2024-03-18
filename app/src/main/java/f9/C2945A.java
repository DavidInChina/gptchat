package f9;

import android.os.Build;
import ce.AbstractC2397c;
import ce.C2399e;
import fe.C3025c;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import l9.AbstractC4353a;

/* renamed from: f9.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2945A implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29761a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f29762b;

    public /* synthetic */ C2945A(int i10, Object obj) {
        this.f29761a = i10;
        this.f29762b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B1.m, ce.e, java.lang.Object] */
    public static C2399e a(int i10) {
        int i11;
        ?? obj = new Object();
        if (i10 < 3) {
            i11 = i10 + 1;
        } else if (i10 < 1073741824) {
            i11 = (int) ((i10 / 0.75f) + 1.0f);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        obj.f1725a = new LinkedHashMap(i11);
        return obj;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29761a;
        Object obj = this.f29762b;
        switch (i10) {
            case 0:
                ((P5.c) obj).getClass();
                return kf.x.f37485Y;
            case 1:
                ((P5.c) obj).getClass();
                return C3025c.f30247a;
            case 2:
                ((P5.c) obj).getClass();
                String str = AbstractC4353a.f37886a;
                String str2 = Build.DEVICE;
                int i11 = Build.VERSION.SDK_INT;
                AbstractC3557B.Z(str2);
                return new Vc.y(str, str2, i11);
            default:
                return (Map) obj;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2945A(LinkedHashMap linkedHashMap) {
        this(linkedHashMap, 0);
        this.f29761a = 3;
    }

    public C2945A(LinkedHashMap linkedHashMap, int i10) {
        this.f29761a = 3;
        this.f29762b = Collections.unmodifiableMap(linkedHashMap);
    }
}
