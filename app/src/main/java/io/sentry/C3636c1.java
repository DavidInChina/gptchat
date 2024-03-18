package io.sentry;

import H0.AbstractC0668a1;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import bg.AbstractC2199g;
import bg.EnumC2210r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3169l;
import id.AbstractC3557B;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Writer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import kg.C4291c;
import l8.AbstractC4344b;
import o3.AbstractC4912h;
import o3.AbstractC4913i;
import o3.C4905a;
import o3.C4907c;
import o3.C4914j;
import q0.C5252d;
import qh.AbstractC5327a;
import qh.C5328b;
import s2.AbstractC5530A;
import s2.AbstractC5534d;
import s2.AbstractC5535e;
import u7.C5849e;
import w7.AbstractC6134f;

/* renamed from: io.sentry.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3636c1 implements AbstractC3170m, K8.n, AbstractC3693x0 {

    /* renamed from: i0  reason: collision with root package name */
    public static volatile C3636c1 f34283i0;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34284Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f34285Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f34286h0;

    public /* synthetic */ C3636c1(int i10, AbstractC2469q0 abstractC2469q0) {
        this.f34284Y = i10;
    }

    public static C3636c1 l() {
        if (f34283i0 == null) {
            synchronized (C3636c1.class) {
                try {
                    if (f34283i0 == null) {
                        f34283i0 = new C3636c1(0);
                    }
                } finally {
                }
            }
        }
        return f34283i0;
    }

    public final void a(String str) {
        Ad.l.Z0("integration is required.", str);
        ((Set) this.f34285Z).add(str);
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }

    public final void c(String str) {
        ((Set) this.f34286h0).add(new io.sentry.protocol.t(str, "7.5.0"));
    }

    public final C3636c1 d() {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        bVar.p();
        bVar.a();
        int i10 = bVar.f34794h0;
        int[] iArr = bVar.f34793Z;
        if (i10 == iArr.length) {
            bVar.f34793Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = bVar.f34793Z;
        int i11 = bVar.f34794h0;
        bVar.f34794h0 = i11 + 1;
        iArr2[i11] = 3;
        bVar.f34792Y.write(123);
        return this;
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    public final boolean equals(Object obj) {
        switch (this.f34284Y) {
            case 9:
                if (!(obj instanceof C1.c)) {
                    return false;
                }
                C1.c cVar = (C1.c) obj;
                cVar.getClass();
                if (this.f34285Z != null) {
                    return false;
                }
                Object obj2 = this.f34286h0;
                cVar.getClass();
                if (obj2 != null) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c4, code lost:
        r0.addAll(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
        if (android.gov.nist.core.Separators.RPAREN.equals(o3.C4905a.b(r6, r11)) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, o3.b] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // g3.AbstractC3170m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        s2.u uVar;
        String str;
        char c10;
        int i12;
        String sb2;
        int i13;
        char c11;
        C4907c c4907c;
        ((s2.u) this.f34285Z).D(i10 + i11, bArr);
        ((s2.u) this.f34285Z).F(i10);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC4913i.c((s2.u) this.f34285Z);
            do {
                uVar = (s2.u) this.f34285Z;
                uVar.getClass();
            } while (!TextUtils.isEmpty(uVar.h(w8.e.f48221c)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                s2.u uVar2 = (s2.u) this.f34285Z;
                ?? r42 = 0;
                int i14 = -1;
                int i15 = 0;
                char c12 = '\uffff';
                while (true) {
                    char c13 = 2;
                    int i16 = 1;
                    if (c12 == '\uffff') {
                        i15 = uVar2.f45194b;
                        String h10 = uVar2.h(w8.e.f48221c);
                        if (h10 == null) {
                            c12 = 0;
                        } else if ("STYLE".equals(h10)) {
                            c12 = 2;
                        } else {
                            c12 = h10.startsWith("NOTE") ? (char) 1 : (char) 3;
                        }
                    } else {
                        uVar2.F(i15);
                        if (c12 == 0) {
                            R4.b.g2(new C4914j(arrayList2), c3169l, abstractC5535e);
                            return;
                        } else if (c12 == 1) {
                            s2.u uVar3 = (s2.u) this.f34285Z;
                            do {
                                uVar3.getClass();
                            } while (!TextUtils.isEmpty(uVar3.h(w8.e.f48221c)));
                        } else {
                            String str2 = null;
                            if (c12 == 2) {
                                if (arrayList2.isEmpty()) {
                                    s2.u uVar4 = (s2.u) this.f34285Z;
                                    uVar4.getClass();
                                    uVar4.h(w8.e.f48221c);
                                    C4905a c4905a = (C4905a) this.f34286h0;
                                    s2.u uVar5 = (s2.u) this.f34285Z;
                                    StringBuilder sb3 = c4905a.f40528b;
                                    sb3.setLength(0);
                                    int i17 = uVar5.f45194b;
                                    do {
                                    } while (!TextUtils.isEmpty(uVar5.h(w8.e.f48221c)));
                                    byte[] bArr2 = uVar5.f45193a;
                                    int i18 = uVar5.f45194b;
                                    s2.u uVar6 = c4905a.f40527a;
                                    uVar6.D(i18, bArr2);
                                    uVar6.F(i17);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (true) {
                                        C4905a.c(uVar6);
                                        if (uVar6.a() >= 5 && "::cue".equals(uVar6.s(5, w8.e.f48221c))) {
                                            int i19 = uVar6.f45194b;
                                            String b10 = C4905a.b(uVar6, sb3);
                                            if (b10 != null) {
                                                if ("{".equals(b10)) {
                                                    uVar6.F(i19);
                                                    str = "";
                                                } else if (Separators.LPAREN.equals(b10)) {
                                                    int i20 = uVar6.f45194b;
                                                    int i21 = uVar6.f45195c;
                                                    int i22 = r42;
                                                    while (i20 < i21 && i22 == 0) {
                                                        int i23 = i20 + 1;
                                                        int i24 = ((char) uVar6.f45193a[i20]) == ')' ? i16 : r42;
                                                        i20 = i23;
                                                        i22 = i24;
                                                    }
                                                    str = uVar6.s((i20 - 1) - uVar6.f45194b, w8.e.f48221c).trim();
                                                } else {
                                                    str = str2;
                                                }
                                                if (str == null && "{".equals(C4905a.b(uVar6, sb3))) {
                                                    ?? obj = new Object();
                                                    obj.f40529a = "";
                                                    obj.f40530b = "";
                                                    obj.f40531c = Collections.emptySet();
                                                    obj.f40532d = "";
                                                    obj.f40533e = str2;
                                                    obj.f40535g = r42;
                                                    obj.f40537i = r42;
                                                    obj.f40538j = i14;
                                                    obj.f40539k = i14;
                                                    obj.f40540l = i14;
                                                    obj.f40541m = i14;
                                                    obj.f40542n = i14;
                                                    obj.f40544p = i14;
                                                    obj.f40545q = r42;
                                                    if (!"".equals(str)) {
                                                        int indexOf = str.indexOf(91);
                                                        if (indexOf != i14) {
                                                            Matcher matcher = C4905a.f40525c.matcher(str.substring(indexOf));
                                                            if (matcher.matches()) {
                                                                String group = matcher.group(i16);
                                                                group.getClass();
                                                                obj.f40532d = group;
                                                            }
                                                            str = str.substring(r42, indexOf);
                                                        }
                                                        int i25 = AbstractC5530A.f45131a;
                                                        String[] split = str.split("\\.", i14);
                                                        char c14 = r42 == true ? 1 : 0;
                                                        char c15 = r42 == true ? 1 : 0;
                                                        char c16 = r42 == true ? 1 : 0;
                                                        char c17 = r42 == true ? 1 : 0;
                                                        String str3 = split[c14];
                                                        int indexOf2 = str3.indexOf(35);
                                                        if (indexOf2 != i14) {
                                                            int i26 = r42 == true ? 1 : 0;
                                                            int i27 = r42 == true ? 1 : 0;
                                                            int i28 = r42 == true ? 1 : 0;
                                                            int i29 = r42 == true ? 1 : 0;
                                                            obj.f40530b = str3.substring(i26, indexOf2);
                                                            obj.f40529a = str3.substring(indexOf2 + 1);
                                                        } else {
                                                            obj.f40530b = str3;
                                                        }
                                                        if (split.length > i16) {
                                                            int length = split.length;
                                                            Gi.e.l(length <= split.length ? i16 : r42);
                                                            obj.f40531c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i16, length)));
                                                        }
                                                    }
                                                    int i30 = r42 == true ? 1 : 0;
                                                    boolean z10 = r42 == true ? 1 : 0;
                                                    boolean z11 = r42 == true ? 1 : 0;
                                                    int i31 = i30;
                                                    String str4 = null;
                                                    boolean z12 = r42;
                                                    while (i31 == 0) {
                                                        int i32 = uVar6.f45194b;
                                                        str4 = C4905a.b(uVar6, sb3);
                                                        int i33 = (str4 == null || "}".equals(str4)) ? i16 : z12 ? 1 : 0;
                                                        if (i33 == 0) {
                                                            uVar6.F(i32);
                                                            C4905a.c(uVar6);
                                                            String a5 = C4905a.a(uVar6, sb3);
                                                            if (!"".equals(a5) && ":".equals(C4905a.b(uVar6, sb3))) {
                                                                C4905a.c(uVar6);
                                                                StringBuilder sb4 = new StringBuilder();
                                                                boolean z13 = false;
                                                                while (true) {
                                                                    if (!z13) {
                                                                        int i34 = uVar6.f45194b;
                                                                        boolean z14 = z13;
                                                                        String b11 = C4905a.b(uVar6, sb3);
                                                                        if (b11 == null) {
                                                                            sb2 = null;
                                                                        } else if (!"}".equals(b11) && !Separators.SEMICOLON.equals(b11)) {
                                                                            sb4.append(b11);
                                                                            z13 = z14;
                                                                        } else {
                                                                            uVar6.F(i34);
                                                                            z13 = true;
                                                                        }
                                                                    } else {
                                                                        sb2 = sb4.toString();
                                                                    }
                                                                }
                                                                if (sb2 != null && !"".equals(sb2)) {
                                                                    int i35 = uVar6.f45194b;
                                                                    String b12 = C4905a.b(uVar6, sb3);
                                                                    if (!Separators.SEMICOLON.equals(b12)) {
                                                                        if ("}".equals(b12)) {
                                                                            uVar6.F(i35);
                                                                        }
                                                                    }
                                                                    if ("color".equals(a5)) {
                                                                        i13 = 1;
                                                                        obj.f40534f = AbstractC5534d.a(sb2, true);
                                                                        obj.f40535g = true;
                                                                    } else {
                                                                        i13 = 1;
                                                                        if ("background-color".equals(a5)) {
                                                                            obj.f40536h = AbstractC5534d.a(sb2, true);
                                                                            obj.f40537i = true;
                                                                        } else if ("ruby-position".equals(a5)) {
                                                                            if ("over".equals(sb2)) {
                                                                                obj.f40544p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                obj.f40544p = 2;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a5)) {
                                                                            obj.f40545q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a5)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                obj.f40539k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a5)) {
                                                                            obj.f40533e = AbstractC4344b.k1(sb2);
                                                                        } else {
                                                                            if ("font-weight".equals(a5)) {
                                                                                if ("bold".equals(sb2)) {
                                                                                    i13 = 1;
                                                                                    obj.f40540l = 1;
                                                                                }
                                                                            } else {
                                                                                i13 = 1;
                                                                                if ("font-style".equals(a5)) {
                                                                                    if ("italic".equals(sb2)) {
                                                                                        obj.f40541m = 1;
                                                                                    }
                                                                                } else if ("font-size".equals(a5)) {
                                                                                    Matcher matcher2 = C4905a.f40526d.matcher(AbstractC4344b.k1(sb2));
                                                                                    if (!matcher2.matches()) {
                                                                                        s2.p.g("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                    } else {
                                                                                        String group2 = matcher2.group(2);
                                                                                        group2.getClass();
                                                                                        switch (group2.hashCode()) {
                                                                                            case 37:
                                                                                                if (group2.equals(Separators.PERCENT)) {
                                                                                                    c11 = 0;
                                                                                                    break;
                                                                                                }
                                                                                                c11 = '\uffff';
                                                                                                break;
                                                                                            case 3240:
                                                                                                if (group2.equals("em")) {
                                                                                                    c11 = 1;
                                                                                                    break;
                                                                                                }
                                                                                                c11 = '\uffff';
                                                                                                break;
                                                                                            case 3592:
                                                                                                if (group2.equals("px")) {
                                                                                                    c11 = 2;
                                                                                                    break;
                                                                                                }
                                                                                                c11 = '\uffff';
                                                                                                break;
                                                                                            default:
                                                                                                c11 = '\uffff';
                                                                                                break;
                                                                                        }
                                                                                        switch (c11) {
                                                                                            case 0:
                                                                                                i12 = 1;
                                                                                                c10 = 2;
                                                                                                obj.f40542n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i12 = 1;
                                                                                                c10 = 2;
                                                                                                obj.f40542n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i12 = 1;
                                                                                                obj.f40542n = 1;
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String group3 = matcher2.group(i12);
                                                                                        group3.getClass();
                                                                                        obj.f40543o = Float.parseFloat(group3);
                                                                                        i16 = i12;
                                                                                        c13 = c10;
                                                                                        i31 = i33;
                                                                                        z12 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            c10 = 2;
                                                                            i16 = i12;
                                                                            c13 = c10;
                                                                            i31 = i33;
                                                                            z12 = false;
                                                                        }
                                                                    }
                                                                    i12 = i13;
                                                                    c10 = 2;
                                                                    i16 = i12;
                                                                    c13 = c10;
                                                                    i31 = i33;
                                                                    z12 = false;
                                                                }
                                                                i12 = 1;
                                                                c10 = 2;
                                                                i16 = i12;
                                                                c13 = c10;
                                                                i31 = i33;
                                                                z12 = false;
                                                            }
                                                        }
                                                        c10 = c13;
                                                        i12 = i16;
                                                        i16 = i12;
                                                        c13 = c10;
                                                        i31 = i33;
                                                        z12 = false;
                                                    }
                                                    char c18 = c13;
                                                    int i36 = i16;
                                                    if ("}".equals(str4)) {
                                                        arrayList3.add(obj);
                                                    }
                                                    i16 = i36;
                                                    c13 = c18;
                                                    str2 = null;
                                                    r42 = 0;
                                                    i14 = -1;
                                                }
                                            }
                                        }
                                        str = str2;
                                        if (str == null) {
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                            } else if (c12 == 3) {
                                s2.u uVar7 = (s2.u) this.f34285Z;
                                Pattern pattern = AbstractC4912h.f40569a;
                                uVar7.getClass();
                                Charset charset = w8.e.f48221c;
                                String h11 = uVar7.h(charset);
                                if (h11 == null) {
                                    c4907c = null;
                                } else {
                                    Pattern pattern2 = AbstractC4912h.f40569a;
                                    Matcher matcher3 = pattern2.matcher(h11);
                                    if (matcher3.matches()) {
                                        c4907c = AbstractC4912h.d(null, matcher3, uVar7, arrayList);
                                    } else {
                                        String h12 = uVar7.h(charset);
                                        if (h12 != null) {
                                            Matcher matcher4 = pattern2.matcher(h12);
                                            if (matcher4.matches()) {
                                                c4907c = AbstractC4912h.d(h11.trim(), matcher4, uVar7, arrayList);
                                            }
                                        }
                                        c4907c = null;
                                    }
                                }
                                if (c4907c != null) {
                                    arrayList2.add(c4907c);
                                }
                            }
                        }
                    }
                }
            }
        } catch (p2.O e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final void g() {
        this.f34285Z = null;
        this.f34286h0 = null;
    }

    public final void h(JarOutputStream jarOutputStream) {
        boolean z10;
        boolean z11;
        N4.a aVar;
        S4.b bVar = (S4.b) this.f34285Z;
        AbstractC5327a abstractC5327a = C5328b.f44137c;
        bVar.getClass();
        bVar.f16146k.d();
        bVar.f16147l.d();
        bVar.f16137b.d();
        Q4.a aVar2 = bVar.f16136a;
        if (aVar2.f14424a >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        S4.a aVar3 = bVar.f16148m;
        if (z10) {
            aVar3.d();
        }
        bVar.f16150o.d();
        if (aVar2.f14424a >= 26) {
            z11 = true;
        } else {
            z11 = false;
        }
        S4.j jVar = bVar.f16149n;
        if (z11) {
            jVar.d();
        }
        bVar.f16145j.d();
        bVar.f16144i.d();
        bVar.f16143h.d();
        bVar.f16138c.d();
        bVar.f16142g.d();
        bVar.f16141f.d();
        bVar.f16140e.d();
        bVar.f16151p.d();
        S4.n[] nVarArr = bVar.f16152q;
        int length = nVarArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            S4.n nVar = nVarArr[i11];
            if ((nVar != aVar3 && nVar != jVar) || !nVar.c().isEmpty()) {
                if (i10 >= 0) {
                    if (nVar.f16181d < 0) {
                        int i12 = nVar.f16180c - 1;
                        int i13 = (~i12) & (i10 + i12);
                        nVar.f16181d = i13;
                        if (i13 >= i10) {
                            S4.l lVar = bVar.f16139d;
                            if (nVar == lVar) {
                                try {
                                    S4.h.i(nVarArr, lVar);
                                    lVar.d();
                                } catch (RuntimeException e10) {
                                    throw N4.a.a("...while writing section " + i11, e10);
                                }
                            }
                            if (nVar instanceof S4.l) {
                                ((S4.l) nVar).j();
                            }
                            i10 = nVar.g() + i13;
                        } else {
                            throw new RuntimeException(android.gov.nist.core.a.e("bogus placement for section ", i11));
                        }
                    } else {
                        throw new RuntimeException("fileOffset already set");
                    }
                } else {
                    nVar.getClass();
                    throw new IllegalArgumentException("fileOffset < 0");
                }
            }
        }
        bVar.f16153r = i10;
        byte[] bArr = new byte[i10];
        U4.c cVar = new U4.c(bArr);
        for (int i14 = 0; i14 < length; i14++) {
            try {
                S4.n nVar2 = nVarArr[i14];
                if ((nVar2 != aVar3 && nVar2 != jVar) || !nVar2.c().isEmpty()) {
                    int b10 = nVar2.b() - cVar.f17497b;
                    if (b10 >= 0) {
                        cVar.f(b10);
                        nVar2.h(cVar);
                    } else {
                        throw new N4.a("excess write of " + (-b10), null);
                    }
                }
            } catch (RuntimeException e11) {
                if (e11 instanceof N4.a) {
                    aVar = (N4.a) e11;
                } else {
                    aVar = new N4.a(null, e11);
                }
                String e12 = android.gov.nist.core.a.e("...while writing section ", i14);
                if (e12 != null) {
                    StringBuffer stringBuffer = aVar.f12710Y;
                    stringBuffer.append(e12);
                    if (!e12.endsWith(Separators.RETURN)) {
                        stringBuffer.append('\n');
                    }
                    throw aVar;
                }
                throw new NullPointerException("str == null");
            }
        }
        int i15 = cVar.f17497b;
        if (i15 == bVar.f16153r) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(bArr, 32, i15 - 32);
                try {
                    int digest = messageDigest.digest(bArr, 12, 20);
                    if (digest == 20) {
                        int i16 = cVar.f17497b;
                        Adler32 adler32 = new Adler32();
                        adler32.update(bArr, 12, i16 - 12);
                        int value = (int) adler32.getValue();
                        bArr[8] = (byte) value;
                        bArr[9] = (byte) (value >> 8);
                        bArr[10] = (byte) (value >> 16);
                        bArr[11] = (byte) (value >> 24);
                        jarOutputStream.write(cVar.f17496a);
                        return;
                    }
                    throw new RuntimeException("unexpected digest write: " + digest + " bytes");
                } catch (DigestException e13) {
                    throw new RuntimeException(e13);
                }
            } catch (NoSuchAlgorithmException e14) {
                throw new RuntimeException(e14);
            }
        }
        throw new RuntimeException("foreshortened write");
    }

    public final int hashCode() {
        int i10;
        switch (this.f34284Y) {
            case 9:
                Object obj = this.f34285Z;
                int i11 = 0;
                if (obj == null) {
                    i10 = 0;
                } else {
                    i10 = obj.hashCode();
                }
                Object obj2 = this.f34286h0;
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                return i10 ^ i11;
            default:
                return super.hashCode();
        }
    }

    @Override // K8.n
    public final Object i() {
        try {
            return K8.w.f9584a.a((Class) this.f34285Z);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f34285Z) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public final C3636c1 j() {
        ((io.sentry.vendor.gson.stream.b) this.f34285Z).h('}', 3, 5);
        return this;
    }

    public final byte[] k() {
        if (((byte[]) this.f34285Z) == null) {
            Object obj = this.f34286h0;
            if (((Callable) obj) != null) {
                this.f34285Z = (byte[]) ((Callable) obj).call();
            }
        }
        byte[] bArr = (byte[]) this.f34285Z;
        if (bArr == null) {
            return new byte[0];
        }
        return bArr;
    }

    public final C5252d m(androidx.compose.ui.node.a aVar) {
        Object obj = this.f34286h0;
        if (((Field) obj) != null) {
            try {
                G0.g0 a5 = ((G0.O) ((Field) obj).get(aVar)).a();
                a5.getClass();
                return androidx.compose.ui.layout.a.c(a5);
            } catch (Exception e10) {
                ((H) this.f34285Z).d(EnumC3642e1.WARNING, "Could not fetch position for LayoutNode", e10);
                return null;
            }
        }
        return null;
    }

    public final C3636c1 n(String str) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        if (str != null) {
            if (bVar.f34797k0 == null) {
                if (bVar.f34794h0 != 0) {
                    bVar.f34797k0 = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        bVar.getClass();
        throw new NullPointerException("name == null");
    }

    public final AutofillId o(long j6) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession j10 = AbstractC0668a1.j(this.f34285Z);
            J0.a I02 = A7.b.I0((View) this.f34286h0);
            Objects.requireNonNull(I02);
            return J0.c.a(j10, A7.a.f(I02.f8729Y), j6);
        }
        return null;
    }

    public final AbstractC0997f p(AbstractC2199g abstractC2199g) {
        Sf.q qVar;
        ug.n nVar;
        AbstractC1000i abstractC1000i;
        Sf.q qVar2 = (Sf.q) abstractC2199g;
        C4291c b10 = qVar2.b();
        EnumC2210r[] enumC2210rArr = EnumC2210r.f25973Y;
        Class<?> declaringClass = qVar2.f16621a.getDeclaringClass();
        if (declaringClass != null) {
            qVar = new Sf.q(declaringClass);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            AbstractC0997f p10 = p(qVar);
            if (p10 != null) {
                nVar = p10.i0();
            } else {
                nVar = null;
            }
            if (nVar != null) {
                abstractC1000i = nVar.e(qVar2.d(), Tf.d.f17218m0);
            } else {
                abstractC1000i = null;
            }
            if (!(abstractC1000i instanceof AbstractC0997f)) {
                return null;
            }
            return (AbstractC0997f) abstractC1000i;
        }
        C4291c e10 = b10.e();
        AbstractC3557B.b0("parent(...)", e10);
        Yf.q qVar3 = (Yf.q) kf.t.h2(((Xf.e) this.f34285Z).c(e10));
        if (qVar3 == null) {
            return null;
        }
        Yf.v vVar = qVar3.f22381o0.f22325d;
        vVar.getClass();
        return vVar.v(qVar2.d(), abstractC2199g);
    }

    public final C3636c1 q(long j6) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        bVar.p();
        bVar.a();
        bVar.f34792Y.write(Long.toString(j6));
        return this;
    }

    public final C3636c1 r(Boolean bool) {
        String str;
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        if (bool == null) {
            bVar.j();
        } else {
            bVar.p();
            bVar.a();
            if (bool.booleanValue()) {
                str = "true";
            } else {
                str = "false";
            }
            bVar.f34792Y.write(str);
        }
        return this;
    }

    public final C3636c1 s(Number number) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        if (number == null) {
            bVar.j();
        } else {
            bVar.p();
            String obj = number.toString();
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                bVar.a();
                bVar.f34792Y.append((CharSequence) obj);
            } else {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
            }
        }
        return this;
    }

    public final C3636c1 t(String str) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        if (str == null) {
            bVar.j();
        } else {
            bVar.p();
            bVar.a();
            bVar.m(str);
        }
        return this;
    }

    public final String toString() {
        switch (this.f34284Y) {
            case 9:
                return "Pair{" + this.f34285Z + Separators.SP + this.f34286h0 + "}";
            default:
                return super.toString();
        }
    }

    public final C3636c1 u(boolean z10) {
        String str;
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.f34285Z;
        bVar.p();
        bVar.a();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.f34792Y.write(str);
        return this;
    }

    public final void v(H h10, Object obj) {
        ((y7.b) this.f34286h0).r(this, h10, obj);
    }

    public final int w(Context context, AbstractC6134f abstractC6134f) {
        A7.b.k0(context);
        A7.b.k0(abstractC6134f);
        int f6 = abstractC6134f.f();
        int i10 = ((SparseIntArray) this.f34285Z).get(f6, -1);
        if (i10 == -1) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < ((SparseIntArray) this.f34285Z).size()) {
                    int keyAt = ((SparseIntArray) this.f34285Z).keyAt(i11);
                    if (keyAt > f6 && ((SparseIntArray) this.f34285Z).get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = ((t7.f) this.f34286h0).b(context, f6);
            }
            ((SparseIntArray) this.f34285Z).put(f6, i10);
        }
        return i10;
    }

    public final void x() {
        ((SparseIntArray) this.f34285Z).clear();
    }

    public final void y(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f34285Z)) {
            hashMap = new HashMap((Map) this.f34285Z);
        }
        synchronized (((Map) this.f34286h0)) {
            hashMap2 = new HashMap((Map) this.f34286h0);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).H0(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((N7.f) entry2.getKey()).a(new C5849e(status));
            }
        }
    }

    public C3636c1(Xf.e eVar) {
        Cf.h hVar = Vf.j.f18954t;
        this.f34284Y = 25;
        this.f34285Z = eVar;
        this.f34286h0 = hVar;
    }

    public /* synthetic */ C3636c1(Object obj, int i10, Object obj2) {
        this.f34284Y = i10;
        this.f34285Z = obj;
        this.f34286h0 = obj2;
    }

    public /* synthetic */ C3636c1(Object obj, Object obj2, int i10) {
        this.f34284Y = i10;
        this.f34286h0 = obj;
        this.f34285Z = obj2;
    }

    public C3636c1() {
        t7.e eVar = t7.e.f45771d;
        this.f34284Y = 15;
        this.f34285Z = new SparseIntArray();
        this.f34286h0 = eVar;
    }

    public C3636c1(Writer writer, int i10) {
        this.f34284Y = 21;
        this.f34285Z = new io.sentry.vendor.gson.stream.b(writer);
        this.f34286h0 = new y7.b(i10, 13);
    }

    public C3636c1(H h10) {
        this.f34284Y = 23;
        this.f34286h0 = null;
        this.f34285Z = h10;
        try {
            Field declaredField = androidx.compose.ui.node.a.class.getDeclaredField("layoutDelegate");
            this.f34286h0 = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            h10.f(EnumC3642e1.WARNING, "Could not find LayoutNode.layoutDelegate field", new Object[0]);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3636c1(int i10) {
        this(new U3.u(28), 17, new long[10]);
        this.f34284Y = i10;
        if (i10 == 7) {
            this.f34285Z = new s2.u();
            this.f34286h0 = new C4905a();
        } else if (i10 != 17) {
            switch (i10) {
                case 11:
                    this.f34286h0 = new Object();
                    return;
                case 12:
                    return;
                case 13:
                    this.f34285Z = "";
                    this.f34286h0 = new ArrayList();
                    return;
                case 14:
                    this.f34285Z = DesugarCollections.synchronizedMap(new WeakHashMap());
                    this.f34286h0 = DesugarCollections.synchronizedMap(new WeakHashMap());
                    return;
                default:
                    this.f34285Z = new CopyOnWriteArraySet();
                    this.f34286h0 = new CopyOnWriteArraySet();
                    return;
            }
        }
    }

    public C3636c1(Object obj) {
        C3636c1 c3636c1 = C8.c.f2729a;
        this.f34284Y = 17;
        this.f34285Z = new U3.u((U3.u) c3636c1.f34285Z);
        this.f34286h0 = Arrays.copyOf((long[]) c3636c1.f34286h0, 10);
    }

    public C3636c1(Callable callable) {
        this.f34284Y = 22;
        this.f34286h0 = callable;
    }

    public C3636c1(Uri uri) {
        this.f34284Y = 4;
        this.f34285Z = uri;
    }
}
