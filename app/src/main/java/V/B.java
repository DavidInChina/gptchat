package V;

import Q1.AbstractC1181i;
import Q1.C1177e;
import Q1.E;
import Z.AbstractC1710f0;
import a1.C1915c;
import android.app.Application;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import io.sentry.S;
import io.sentry.r1;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q1.C5257c;
import s1.AbstractC5524f;
import s1.AbstractC5526h;
import z.AbstractC6696f;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17894a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17895b;

    /* renamed from: c  reason: collision with root package name */
    public Object f17896c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17897d;

    /* renamed from: e  reason: collision with root package name */
    public Object f17898e;

    public B(File file, boolean z10, S s10, FileOutputStream fileOutputStream, r1 r1Var) {
        this.f17895b = file;
        this.f17894a = z10;
        this.f17896c = s10;
        this.f17897d = fileOutputStream;
        this.f17898e = r1Var;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        E[] eArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (eArr = (E[]) editable.getSpans(selectionStart, selectionEnd, E.class)) != null && eArr.length > 0) {
            for (E e10 : eArr) {
                int spanStart = editable.getSpanStart(e10);
                int spanEnd = editable.getSpanEnd(e10);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final C5257c a() {
        String str;
        String str2;
        String[] strArr;
        C5257c c5257c = (C5257c) this.f17895b;
        if (!TextUtils.isEmpty(c5257c.f43644d)) {
            Intent[] intentArr = c5257c.f43643c;
            if (intentArr != null && intentArr.length != 0) {
                if (this.f17894a) {
                    if (c5257c.f43647g == null) {
                        c5257c.f43647g = new p1.m(c5257c.f43642b);
                    }
                    c5257c.f43648h = true;
                }
                if (((Set) this.f17896c) != null) {
                    if (c5257c.f43646f == null) {
                        c5257c.f43646f = new HashSet();
                    }
                    c5257c.f43646f.addAll((Set) this.f17896c);
                }
                Map map = (Map) this.f17897d;
                if (map != null) {
                    if (c5257c.f43649i == null) {
                        c5257c.f43649i = new PersistableBundle();
                    }
                    for (String str3 : map.keySet()) {
                        Map map2 = (Map) map.get(str3);
                        c5257c.f43649i.putStringArray(str3, (String[]) map2.keySet().toArray(new String[0]));
                        for (String str4 : map2.keySet()) {
                            List list = (List) map2.get(str4);
                            PersistableBundle persistableBundle = c5257c.f43649i;
                            String j6 = android.gov.nist.core.a.j(str3, Separators.SLASH, str4);
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(j6, strArr);
                        }
                    }
                }
                if (((Uri) this.f17898e) != null) {
                    if (c5257c.f43649i == null) {
                        c5257c.f43649i = new PersistableBundle();
                    }
                    PersistableBundle persistableBundle2 = c5257c.f43649i;
                    Uri uri = (Uri) this.f17898e;
                    String scheme = uri.getScheme();
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    if (scheme != null) {
                        if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                                StringBuilder sb2 = new StringBuilder("//");
                                String str5 = "";
                                if (uri.getHost() != null) {
                                    str2 = uri.getHost();
                                } else {
                                    str2 = str5;
                                }
                                sb2.append(str2);
                                if (uri.getPort() != -1) {
                                    str5 = ":" + uri.getPort();
                                }
                                schemeSpecificPart = R.a.t(sb2, str5, "/...");
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(64);
                            sb3.append(scheme);
                            sb3.append(':');
                            if (schemeSpecificPart != null) {
                                for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                                    char charAt = schemeSpecificPart.charAt(i10);
                                    if (charAt != '-' && charAt != '@' && charAt != '.') {
                                        sb3.append('x');
                                    } else {
                                        sb3.append(charAt);
                                    }
                                }
                            }
                            str = sb3.toString();
                            persistableBundle2.putString("extraSliceUri", str);
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(64);
                    if (scheme != null) {
                        sb4.append(scheme);
                        sb4.append(':');
                    }
                    if (schemeSpecificPart != null) {
                        sb4.append(schemeSpecificPart);
                    }
                    str = sb4.toString();
                    persistableBundle2.putString("extraSliceUri", str);
                }
                return c5257c;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public final boolean c(CharSequence charSequence, int i10, int i11, Q1.D d10) {
        int i12;
        if ((d10.f14307c & 3) == 0) {
            AbstractC1181i abstractC1181i = (AbstractC1181i) this.f17897d;
            R1.a c10 = d10.c();
            int a5 = c10.a(8);
            if (a5 != 0) {
                ((ByteBuffer) c10.f15023d).getShort(a5 + c10.f15020a);
            }
            C1177e c1177e = (C1177e) abstractC1181i;
            c1177e.getClass();
            ThreadLocal threadLocal = C1177e.f14317b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = c1177e.f14318a;
            String sb3 = sb2.toString();
            int i13 = AbstractC5526h.f45110a;
            boolean a10 = AbstractC5524f.a(textPaint, sb3);
            int i14 = d10.f14307c & 4;
            if (a10) {
                i12 = i14 | 2;
            } else {
                i12 = i14 | 1;
            }
            d10.f14307c = i12;
        }
        if ((d10.f14307c & 3) != 2) {
            return false;
        }
        return true;
    }

    public final Object d(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Q1.s sVar) {
        int i13;
        Q1.A a5;
        boolean z11;
        Q1.v vVar = new Q1.v((Q1.A) ((U3.n) this.f17896c).f17428h0, this.f17894a, (int[]) this.f17898e);
        int codePointAt = Character.codePointAt(charSequence, i10);
        boolean z12 = true;
        int i14 = 0;
        int i15 = i10;
        loop0: while (true) {
            i13 = i15;
            while (i15 < i11 && i14 < i12 && z12) {
                SparseArray sparseArray = vVar.f14353c.f14298a;
                if (sparseArray == null) {
                    a5 = null;
                } else {
                    a5 = (Q1.A) sparseArray.get(codePointAt);
                }
                if (vVar.f14351a != 2) {
                    if (a5 == null) {
                        vVar.a();
                        z11 = true;
                    } else {
                        vVar.f14351a = 2;
                        vVar.f14353c = a5;
                        vVar.f14356f = 1;
                        z11 = true;
                    }
                } else {
                    if (a5 != null) {
                        vVar.f14353c = a5;
                        vVar.f14356f++;
                    } else {
                        if (codePointAt == 65038) {
                            vVar.a();
                        } else if (codePointAt != 65039) {
                            Q1.A a10 = vVar.f14353c;
                            if (a10.f14299b != null) {
                                if (vVar.f14356f == 1) {
                                    if (vVar.b()) {
                                        vVar.f14354d = vVar.f14353c;
                                        vVar.a();
                                    } else {
                                        vVar.a();
                                    }
                                } else {
                                    vVar.f14354d = a10;
                                    vVar.a();
                                }
                                z11 = true;
                            } else {
                                vVar.a();
                            }
                        }
                        z11 = true;
                    }
                    z11 = true;
                }
                vVar.f14355e = codePointAt;
                if (!z11) {
                    if (!z11) {
                        if (z11) {
                            if (z10 || !c(charSequence, i13, i15, vVar.f14354d.f14299b)) {
                                z12 = sVar.a(charSequence, i13, i15, vVar.f14354d.f14299b);
                                i14++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i15;
                        if (charCount < i11) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i15 = charCount;
                    }
                } else {
                    i15 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                    if (i15 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i15);
                    }
                }
            }
        }
        if (vVar.f14351a == 2 && vVar.f14353c.f14299b != null && ((vVar.f14356f > 1 || vVar.b()) && i14 < i12 && z12 && (z10 || !c(charSequence, i13, i15, vVar.f14353c.f14299b)))) {
            sVar.a(charSequence, i13, i15, vVar.f14353c.f14299b);
        }
        return sVar.b();
    }

    public B(U3.n nVar, C1915c c1915c, C1177e c1177e, Set set) {
        this.f17895b = c1915c;
        this.f17896c = nVar;
        this.f17897d = c1177e;
        this.f17894a = false;
        this.f17898e = null;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            d(str, 0, str.length(), 1, true, new Q1.u(str, 0, 0));
        }
    }

    public B(boolean z10, AbstractC1710f0 abstractC1710f0) {
        this.f17894a = z10;
        this.f17895b = abstractC1710f0;
        this.f17896c = AbstractC6696f.a(0.0f);
        this.f17897d = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q1.c, java.lang.Object] */
    public B(Application application, String str) {
        ?? obj = new Object();
        this.f17895b = obj;
        obj.f43641a = application;
        obj.f43642b = str;
    }
}
