package i4;

import Wh.p;
import Wh.q;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import f5.C2937a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class k implements y4.b, d5.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32700a;

    public /* synthetic */ k(int i10) {
        this.f32700a = i10;
    }

    public static q g(q qVar, q qVar2) {
        p pVar = new p();
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String y10 = qVar.y(i10);
            String T = qVar.T(i10);
            if ((!Lg.n.f2(SIPHeaderNames.WARNING, y10) || !Lg.n.I2(T, "1", false)) && (Lg.n.f2(SIPHeaderNames.CONTENT_LENGTH, y10) || Lg.n.f2(SIPHeaderNames.CONTENT_ENCODING, y10) || Lg.n.f2(SIPHeaderNames.CONTENT_TYPE, y10) || !h(y10) || qVar2.r(y10) == null)) {
                pVar.b(y10, T);
            }
        }
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String y11 = qVar2.y(i11);
            if (!Lg.n.f2(SIPHeaderNames.CONTENT_LENGTH, y11) && !Lg.n.f2(SIPHeaderNames.CONTENT_ENCODING, y11) && !Lg.n.f2(SIPHeaderNames.CONTENT_TYPE, y11) && h(y11)) {
                pVar.b(y11, qVar2.T(i11));
            }
        }
        return pVar.e();
    }

    public static boolean h(String str) {
        if (!Lg.n.f2("Connection", str) && !Lg.n.f2("Keep-Alive", str) && !Lg.n.f2(SIPHeaderNames.PROXY_AUTHENTICATE, str) && !Lg.n.f2(SIPHeaderNames.PROXY_AUTHORIZATION, str) && !Lg.n.f2("TE", str) && !Lg.n.f2("Trailers", str) && !Lg.n.f2("Transfer-Encoding", str) && !Lg.n.f2("Upgrade", str)) {
            return true;
        }
        return false;
    }

    @Override // d5.g
    public final ArrayList a() {
        String str;
        ArrayList arrayList = new ArrayList();
        C2937a.d("VendorInformation", "Collecting signals", new Throwable[0]);
        arrayList.add(new d5.f("mobile_sdk__manufacturer", Build.MANUFACTURER));
        arrayList.add(new d5.f("mobile_sdk__model", Build.MODEL));
        arrayList.add(new d5.f("mobile_sdk__brand", Build.BRAND));
        arrayList.add(new d5.f("mobile_sdk__product", Build.PRODUCT));
        arrayList.add(new d5.f("mobile_sdk__device", Build.DEVICE));
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SKU;
            arrayList.add(new d5.f("mobile_sdk__sku", str));
        }
        return arrayList;
    }

    @Override // y4.b
    public final boolean b(float f6) {
        throw new IllegalStateException("not implemented");
    }

    @Override // y4.b
    public final J4.a c() {
        throw new IllegalStateException("not implemented");
    }

    @Override // y4.b
    public final boolean d(float f6) {
        return false;
    }

    @Override // y4.b
    public final float e() {
        return 1.0f;
    }

    @Override // y4.b
    public final float f() {
        return 0.0f;
    }

    public final String i(String str, String str2) {
        switch (this.f32700a) {
            case 20:
                return "Authorized Party (azp) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
            default:
                return "Nonce (nonce) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
        }
    }

    @Override // y4.b
    public final boolean isEmpty() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        this(0);
        this.f32700a = i10;
        if (i10 != 12) {
            switch (i10) {
                case 1:
                    this(1);
                    return;
                case 2:
                    this(2);
                    return;
                case 3:
                    this(3);
                    return;
                case 4:
                    this(4);
                    return;
                case 5:
                    this(5);
                    return;
                case 6:
                    this(6);
                    return;
                default:
                    switch (i10) {
                        case 14:
                            this(14);
                            return;
                        case 15:
                            this(15);
                            return;
                        case 16:
                            this(16);
                            return;
                        case 17:
                            this(17);
                            return;
                        case 18:
                            this(18);
                            return;
                        case 19:
                            this(19);
                            return;
                        case 20:
                            this(20);
                            return;
                        case 21:
                            this(21);
                            return;
                        case 22:
                            this(22);
                            return;
                        case 23:
                            this(23);
                            return;
                        case 24:
                            this(24);
                            return;
                        case 25:
                            this(25);
                            return;
                        case 26:
                            this(26);
                            return;
                        case 27:
                            this(27);
                            return;
                        case 28:
                            this(28);
                            return;
                        case 29:
                            this(29);
                            return;
                        default:
                            return;
                    }
            }
        }
        this(12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj) {
        this(7);
        this.f32700a = 7;
    }
}
