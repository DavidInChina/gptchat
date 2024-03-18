package U2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p2.M;
import r.f;
import s2.t;
import s2.u;
import w8.e;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17390f;

    public b(int i10) {
        this.f17390f = i10;
    }

    @Override // r.f
    public final M u(T2.a aVar, ByteBuffer byteBuffer) {
        switch (this.f17390f) {
            case 0:
                if (byteBuffer.get() == 116) {
                    t tVar = new t(byteBuffer.limit(), byteBuffer.array());
                    int i10 = 12;
                    tVar.s(12);
                    int f6 = (tVar.f() + tVar.i(12)) - 4;
                    tVar.s(44);
                    tVar.t(tVar.i(12));
                    tVar.s(16);
                    ArrayList arrayList = new ArrayList();
                    while (tVar.f() < f6) {
                        tVar.s(48);
                        int i11 = tVar.i(8);
                        tVar.s(4);
                        int f10 = tVar.f() + tVar.i(i10);
                        String str = null;
                        String str2 = null;
                        while (tVar.f() < f10) {
                            int i12 = tVar.i(8);
                            int i13 = tVar.i(8);
                            int f11 = tVar.f() + i13;
                            if (i12 == 2) {
                                int i14 = tVar.i(16);
                                tVar.s(8);
                                if (i14 == 3) {
                                    while (tVar.f() < f11) {
                                        int i15 = tVar.i(8);
                                        Charset charset = e.f48219a;
                                        byte[] bArr = new byte[i15];
                                        tVar.k(bArr, i15);
                                        String str3 = new String(bArr, charset);
                                        int i16 = tVar.i(8);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            tVar.t(tVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i12 == 21) {
                                Charset charset2 = e.f48219a;
                                byte[] bArr2 = new byte[i13];
                                tVar.k(bArr2, i13);
                                str2 = new String(bArr2, charset2);
                            }
                            tVar.p(f11 * 8);
                        }
                        tVar.p(f10 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(i11, str.concat(str2)));
                        }
                        i10 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new M(arrayList);
                    }
                }
                return null;
            default:
                u uVar = new u(byteBuffer.limit(), byteBuffer.array());
                String p10 = uVar.p();
                p10.getClass();
                String p11 = uVar.p();
                p11.getClass();
                return new M(new V2.a(p10, p11, uVar.o(), uVar.o(), Arrays.copyOfRange(uVar.f45193a, uVar.f45194b, uVar.f45195c)));
        }
    }
}
