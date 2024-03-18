package S4;

import android.gov.nist.core.Separators;
import r9.y;

/* loaded from: classes2.dex */
public final class d extends e {
    @Override // S4.f
    public final g b() {
        return g.TYPE_HEADER_ITEM;
    }

    @Override // S4.f
    public final int c() {
        return 112;
    }

    @Override // S4.f
    public final void d(b bVar, U4.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = bVar.f16139d.b();
        int b11 = bVar.f16137b.b();
        l lVar = bVar.f16139d;
        int b12 = lVar.b();
        lVar.f();
        int i14 = (b12 + lVar.f16173h) - b11;
        int i15 = bVar.f16136a.f14424a;
        String str = "039";
        if (i15 < 28) {
            if (i15 >= 10000) {
                str = "040";
            } else if (i15 < 28) {
                str = i15 >= 26 ? "038" : i15 >= 24 ? "037" : "035";
            }
        }
        String A10 = android.gov.nist.core.a.A("dex\n", str, "\u0000");
        if (cVar.c()) {
            StringBuilder sb2 = new StringBuilder("magic: ");
            T4.a aVar = new T4.a(A10);
            sb2.append(Separators.DOUBLE_QUOTE + aVar.b() + '\"');
            cVar.b(8, sb2.toString());
            cVar.b(4, "checksum");
            cVar.b(20, "signature");
            int i16 = bVar.f16153r;
            if (i16 >= 0) {
                cVar.b(4, "file_size:       ".concat(y.d1(i16)));
                cVar.b(4, "header_size:     ".concat(y.d1(112)));
                cVar.b(4, "endian_tag:      ".concat(y.d1(305419896)));
                cVar.b(4, "link_size:       0");
                cVar.b(4, "link_off:        0");
                cVar.b(4, "map_off:         ".concat(y.d1(b10)));
            } else {
                throw new RuntimeException("file size not yet known");
            }
        }
        int i17 = 0;
        for (int i18 = 8; i17 < i18; i18 = 8) {
            char charAt = A10.charAt(i17);
            int i19 = cVar.f17497b;
            int i20 = i19 + 1;
            byte[] bArr = cVar.f17496a;
            if (i20 <= bArr.length) {
                bArr[i19] = (byte) charAt;
                cVar.f17497b = i20;
                i17++;
            } else {
                throw new IndexOutOfBoundsException("attempt to write past the end");
            }
        }
        cVar.f(24);
        int i21 = bVar.f16153r;
        if (i21 >= 0) {
            cVar.d(i21);
            cVar.d(112);
            cVar.d(305419896);
            cVar.f(8);
            cVar.d(b10);
            bVar.f16141f.k(cVar);
            bVar.f16142g.k(cVar);
            bVar.f16143h.k(cVar);
            c cVar2 = bVar.f16144i;
            cVar2.f();
            int size = cVar2.f16154f.size();
            if (size == 0) {
                i10 = 0;
            } else {
                i10 = cVar2.b();
            }
            if (cVar.c()) {
                cVar.b(4, "field_ids_size:  ".concat(y.d1(size)));
                cVar.b(4, "field_ids_off:   ".concat(y.d1(i10)));
            }
            cVar.d(size);
            cVar.d(i10);
            k kVar = bVar.f16145j;
            kVar.f();
            int size2 = kVar.f16169f.size();
            if (size2 == 0) {
                i11 = 0;
            } else {
                i11 = kVar.b();
            }
            if (cVar.c()) {
                cVar.b(4, "method_ids_size: ".concat(y.d1(size2)));
                cVar.b(4, "method_ids_off:  ".concat(y.d1(i11)));
            }
            cVar.d(size2);
            cVar.d(i11);
            a aVar2 = bVar.f16146k;
            aVar2.f();
            int size3 = aVar2.f16134g.size();
            if (size3 == 0) {
                i12 = 0;
            } else {
                i12 = aVar2.b();
            }
            if (cVar.c()) {
                i13 = 4;
                cVar.b(4, "class_defs_size: ".concat(y.d1(size3)));
                cVar.b(4, "class_defs_off:  ".concat(y.d1(i12)));
            } else {
                i13 = 4;
            }
            cVar.d(size3);
            cVar.d(i12);
            if (cVar.c()) {
                cVar.b(i13, "data_size:       ".concat(y.d1(i14)));
                cVar.b(i13, "data_off:        ".concat(y.d1(b11)));
            }
            cVar.d(i14);
            cVar.d(b11);
            return;
        }
        throw new RuntimeException("file size not yet known");
    }

    @Override // S4.f
    public final void a(b bVar) {
    }
}
