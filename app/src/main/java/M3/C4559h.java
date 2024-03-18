package m3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import g3.AbstractC3162e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import r2.C5357a;
import s2.AbstractC5530A;

/* renamed from: m3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4559h implements AbstractC3162e {

    /* renamed from: Y  reason: collision with root package name */
    public final C4554c f38935Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long[] f38936Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Map f38937h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f38938i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f38939j0;

    public C4559h(C4554c c4554c, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f38935Y = c4554c;
        this.f38938i0 = hashMap2;
        this.f38939j0 = hashMap3;
        this.f38937h0 = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        c4554c.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f38936Z = jArr;
    }

    @Override // g3.AbstractC3162e
    public final int a(long j6) {
        long[] jArr = this.f38936Z;
        int b10 = AbstractC5530A.b(jArr, j6, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // g3.AbstractC3162e
    public final long b(int i10) {
        return this.f38936Z[i10];
    }

    @Override // g3.AbstractC3162e
    public final List c(long j6) {
        C4552a[] c4552aArr;
        C4554c c4554c = this.f38935Y;
        c4554c.getClass();
        ArrayList arrayList = new ArrayList();
        c4554c.g(j6, c4554c.f38888h, arrayList);
        TreeMap treeMap = new TreeMap();
        c4554c.i(j6, false, c4554c.f38888h, treeMap);
        Map map = this.f38937h0;
        Map map2 = this.f38938i0;
        c4554c.h(j6, map, map2, c4554c.f38888h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f38939j0.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C4557f c4557f = (C4557f) map2.get(pair.first);
                c4557f.getClass();
                arrayList2.add(new r2.b(null, null, null, decodeByteArray, c4557f.f38908c, 0, c4557f.f38910e, c4557f.f38907b, 0, Integer.MIN_VALUE, -3.4028235E38f, c4557f.f38911f, c4557f.f38912g, false, -16777216, c4557f.f38915j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C4557f c4557f2 = (C4557f) map2.get(entry.getKey());
            c4557f2.getClass();
            C5357a c5357a = (C5357a) entry.getValue();
            CharSequence charSequence = c5357a.f44320a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C4552a c4552a : (C4552a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C4552a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c4552a), spannableStringBuilder.getSpanEnd(c4552a), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c5357a.f44324e = c4557f2.f38908c;
            c5357a.f44325f = c4557f2.f38909d;
            c5357a.f44326g = c4557f2.f38910e;
            c5357a.f44327h = c4557f2.f38907b;
            c5357a.f44331l = c4557f2.f38911f;
            c5357a.f44330k = c4557f2.f38914i;
            c5357a.f44329j = c4557f2.f38913h;
            c5357a.f44335p = c4557f2.f38915j;
            arrayList2.add(c5357a.a());
        }
        return arrayList2;
    }

    @Override // g3.AbstractC3162e
    public final int d() {
        return this.f38936Z.length;
    }
}
