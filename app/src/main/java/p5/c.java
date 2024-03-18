package P5;

import Bg.A;
import Bg.AbstractC0210c;
import Bg.c0;
import Bg.m0;
import Bg.p0;
import C2.i;
import C2.j;
import C2.z;
import I8.r;
import I8.u;
import K4.J;
import Kg.m;
import Kg.p;
import L2.AbstractC0886g;
import Q1.E;
import Q1.l;
import U0.f;
import V1.M;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Path;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import c1.AbstractC2279d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.google.usecase.BillingClientUseCaseKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import di.D;
import e2.C2769a;
import f3.h;
import id.AbstractC3557B;
import io.sentry.android.core.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import k5.F;
import l2.C4333d;
import l8.AbstractC4344b;
import nf.AbstractC4830j;
import q1.AbstractC5260f;
import q5.g;
import rg.AbstractC5493d;
import s3.AbstractC5540C;
import s3.C5542E;
import s3.C5552b;
import s3.C5562l;
import s3.C5569t;
import u3.AbstractC5830c;
import x6.AbstractC6287d;
import x6.B;
import x6.C6278a;
import x6.C6281b;
import x6.C6317n;
import x6.C6337u;
import x6.C6340v;
import x6.C6346x;
import y3.AbstractC6539a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public class c implements b, f, b0, W8.a, i, AbstractC0886g, Z5.d, d6.d, D, h, AbstractC5830c, AbstractC6539a, I, AbstractC4830j {

    /* renamed from: Y  reason: collision with root package name */
    public static c f13819Y;

    public /* synthetic */ c(int i10) {
    }

    public static void B() {
        c cVar = C2769a.f28742b;
    }

    public static long C(View view) {
        Context context;
        float f6;
        if (AbstractC3557B.f33084g < 0) {
            Window window = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                Context context2 = view.getContext();
                AbstractC3557B.a0("null cannot be cast to non-null type android.app.Activity", context2);
                window = ((Activity) context2).getWindow();
            }
            float f10 = 60.0f;
            if (window != null) {
                f6 = window.getWindowManager().getDefaultDisplay().getRefreshRate();
            } else {
                f6 = 60.0f;
            }
            if (f6 >= 30.0f && f6 <= 200.0f) {
                f10 = f6;
            }
            AbstractC3557B.f33084g = (1000 / f10) * ((float) UtilsKt.MICROS_MULTIPLIER);
        }
        return AbstractC3557B.f33084g;
    }

    public static Path E(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        path.lineTo(f11, f12);
        return path;
    }

    public static String H(String str, String str2) {
        AbstractC3557B.c0("tableName", str);
        AbstractC3557B.c0("triggerType", str2);
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static C3.b I(J0.a aVar, SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("refHolder", aVar);
        AbstractC3557B.c0("sqLiteDatabase", sQLiteDatabase);
        C3.b bVar = (C3.b) aVar.f8729Y;
        if (bVar == null || !AbstractC3557B.K(bVar.f2645Y, sQLiteDatabase)) {
            C3.b bVar2 = new C3.b(sQLiteDatabase);
            aVar.f8729Y = bVar2;
            return bVar2;
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
        if (r11 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int i12;
        Object obj = l.f14325j;
        if (editable == null || inputConnection == null || i10 < 0 || i11 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z10) {
            int max = Math.max(i10, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z11) {
                                selectionStart = 0;
                            }
                        } else {
                            char charAt = editable.charAt(selectionStart);
                            if (z11) {
                                break;
                            } else if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else if (Character.isHighSurrogate(charAt)) {
                                break loop0;
                            } else {
                                z11 = true;
                            }
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i11, 0);
            i12 = editable.length();
            if (selectionEnd >= 0 && i12 >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z12 = false;
                    while (true) {
                        if (max2 == 0) {
                            i12 = selectionEnd;
                            break loop2;
                        } else if (selectionEnd < i12) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z12) {
                                break;
                            } else if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else if (Character.isLowSurrogate(charAt2)) {
                                break loop2;
                            } else {
                                selectionEnd++;
                                z12 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            i12 = -1;
            if (selectionStart == -1 || i12 == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i10, 0);
            i12 = Math.min(selectionEnd + i11, editable.length());
        }
        E[] eArr = (E[]) editable.getSpans(selectionStart, i12, E.class);
        if (eArr == null || eArr.length <= 0) {
            return false;
        }
        for (E e10 : eArr) {
            int spanStart = editable.getSpanStart(e10);
            int spanEnd = editable.getSpanEnd(e10);
            selectionStart = Math.min(spanStart, selectionStart);
            i12 = Math.max(spanEnd, i12);
        }
        int max3 = Math.max(selectionStart, 0);
        int min = Math.min(i12, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(max3, min);
        inputConnection.endBatchEdit();
        return true;
    }

    public static long s(boolean z10, int i10, int i11, long j6, long j10, int i12, boolean z11, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        AbstractC2469q0.q("backoffPolicy", i11);
        if (j14 != Long.MAX_VALUE && z11) {
            if (i12 == 0) {
                return j14;
            }
            return N.k(j14, BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS + j10);
        } else if (z10) {
            if (i11 == 2) {
                j16 = i10 * j6;
            } else {
                j16 = Math.scalb((float) j6, i10 - 1);
            }
            return N.m(j16, 18000000L) + j10;
        } else if (z11) {
            if (i12 == 0) {
                j15 = j10 + j11;
            } else {
                j15 = j10 + j13;
            }
            if (j12 != j13 && i12 == 0) {
                return (j13 - j12) + j15;
            }
            return j15;
        } else if (j10 == -1) {
            return Long.MAX_VALUE;
        } else {
            return j10 + j11;
        }
    }

    public static Bg.I t(Mf.b0 b0Var, AbstractC0210c abstractC0210c, c0 c0Var, A a5) {
        AbstractC3557B.c0("typeAttr", abstractC0210c);
        AbstractC3557B.c0("typeParameterUpperBoundEraser", c0Var);
        AbstractC3557B.c0("erasedUpperBound", a5);
        if (!(abstractC0210c instanceof Zf.a)) {
            return new Bg.I(a5, p0.f2148j0);
        }
        Zf.a aVar = (Zf.a) abstractC0210c;
        if (!aVar.f23715c) {
            aVar = aVar.g(Zf.b.f23719Y);
        }
        int ordinal = aVar.f23714b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new Bg.I(a5, p0.f2146h0);
            }
            throw new RuntimeException();
        } else if (!b0Var.J().f2151Z) {
            return new Bg.I(AbstractC5493d.e(b0Var).n(), p0.f2146h0);
        } else {
            List parameters = a5.y0().getParameters();
            AbstractC3557B.b0("getParameters(...)", parameters);
            if (!parameters.isEmpty()) {
                return new Bg.I(a5, p0.f2148j0);
            }
            return m0.l(b0Var, aVar);
        }
    }

    public static C5562l u(Context context, AbstractC5540C abstractC5540C, Bundle bundle, EnumC2082q enumC2082q, C5569t c5569t) {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        AbstractC3557B.c0("destination", abstractC5540C);
        AbstractC3557B.c0("hostLifecycleState", enumC2082q);
        return new C5562l(context, abstractC5540C, bundle, enumC2082q, c5569t, uuid, null);
    }

    public static MediaCodec v(C2.h hVar) {
        hVar.f2540a.getClass();
        String str = hVar.f2540a.f2547a;
        AbstractC5260f.g("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        AbstractC5260f.q();
        return createByCodecName;
    }

    public static P w(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new P();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                hashMap.put(str, bundle2.get(str));
            }
            return new P(hashMap);
        }
        ClassLoader classLoader = P.class.getClassLoader();
        AbstractC3557B.Z(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(DiagnosticsEntry.Histogram.VALUES_KEY);
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj);
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new P(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    public static byte[] x(long j6, x8.N n10) {
        ArrayList<? extends Parcelable> z10 = AbstractC2279d.z(n10);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", z10);
        bundle.putLong("d", j6);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static AbstractC5540C y(C5542E c5542e) {
        AbstractC3557B.c0("<this>", c5542e);
        return (AbstractC5540C) m.m1(p.c1(c5542e.U(c5542e.f45228p0, true), C5552b.f45289o0));
    }

    public static C6278a z(u uVar) {
        int[] h10;
        String str;
        Long l10;
        C6281b c6281b;
        C6340v c6340v;
        C6337u c6337u;
        C6317n c6317n;
        C6346x c6346x;
        B b10;
        try {
            String T = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.m(i10), T)) {
                    r q02 = uVar.q0(ParameterNames.ID);
                    if (q02 != null) {
                        str = q02.T();
                    } else {
                        str = null;
                    }
                    r q03 = uVar.q0("loading_time");
                    if (q03 != null) {
                        l10 = Long.valueOf(q03.I());
                    } else {
                        l10 = null;
                    }
                    r q04 = uVar.q0("target");
                    if (q04 != null) {
                        c6281b = J.y(q04.y());
                    } else {
                        c6281b = null;
                    }
                    r q05 = uVar.q0("frustration");
                    if (q05 != null) {
                        c6340v = F.z(q05.y());
                    } else {
                        c6340v = null;
                    }
                    r q06 = uVar.q0("error");
                    if (q06 != null) {
                        c6337u = F.y(q06.y());
                    } else {
                        c6337u = null;
                    }
                    r q07 = uVar.q0("crash");
                    if (q07 != null) {
                        c6317n = F.r(q07.y());
                    } else {
                        c6317n = null;
                    }
                    r q08 = uVar.q0("long_task");
                    if (q08 != null) {
                        c6346x = F.A(q08.y());
                    } else {
                        c6346x = null;
                    }
                    r q09 = uVar.q0("resource");
                    if (q09 != null) {
                        b10 = F.D(q09.y());
                    } else {
                        b10 = null;
                    }
                    return new C6278a(i10, str, l10, c6281b, c6340v, c6337u, c6317n, c6346x, b10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ActionEventAction", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ActionEventAction", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ActionEventAction", e12);
        }
    }

    public int A() {
        c cVar = C2769a.f28742b;
        return 1;
    }

    public Signature[] F(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public int G() {
        c cVar = C2769a.f28742b;
        return 0;
    }

    @Override // U0.f
    public U0.d a() {
        return new U0.d(AbstractC4344b.F0(new U0.c(new U0.a(Locale.getDefault()))));
    }

    @Override // androidx.lifecycle.b0
    public Y b(Class cls) {
        return new M(true);
    }

    @Override // C2.i
    public j c(C2.h hVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = v(hVar);
            AbstractC5260f.g("configureCodec");
            mediaCodec.configure(hVar.f2541b, hVar.f2543d, hVar.f2544e, 0);
            AbstractC5260f.q();
            AbstractC5260f.g("startCodec");
            mediaCodec.start();
            AbstractC5260f.q();
            return new z(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override // androidx.lifecycle.b0
    public Y d(Class cls, C4333d c4333d) {
        return b(cls);
    }

    @Override // Z5.d
    public void g(int i10, String str, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, Long l10) {
        AbstractC3557B.c0("message", str);
    }

    @Override // d6.d
    public void i(r5.d dVar, d6.c cVar) {
        AbstractC3557B.c0("sdkCore", dVar);
    }

    @Override // W8.a
    public long j() {
        return SystemClock.elapsedRealtime();
    }

    @Override // P5.b
    public g k() {
        return new g();
    }

    @Override // W8.a
    public long l() {
        return System.currentTimeMillis();
    }

    @Override // f3.h
    public L2.B m() {
        return new L2.u(-9223372036854775807L);
    }

    @Override // f3.h
    public long n(L2.r rVar) {
        return -1L;
    }

    @Override // y3.AbstractC6539a
    public void p(B3.b bVar) {
        ((C3.b) bVar).t("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // U0.f
    public U0.a r(String str) {
        return new U0.a(Locale.forLanguageTag(str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        this(0);
        if (i10 == 1) {
            this(1);
        } else if (i10 == 2) {
            this(2);
        } else if (i10 == 4) {
            this(4);
        } else if (i10 != 5) {
            switch (i10) {
                case 12:
                    this(12);
                    return;
                case 13:
                    this(13);
                    return;
                case 14:
                    this(14);
                    return;
                case 15:
                    this(15);
                    return;
                default:
                    switch (i10) {
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
                        default:
                            return;
                    }
            }
        } else {
            this(5);
        }
    }

    public c() {
    }

    public void P() {
    }

    @Override // u3.AbstractC5830c
    public void f() {
    }

    public InputFilter[] D(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public void K(boolean z10) {
    }

    public void L(boolean z10) {
    }

    public void M(boolean z10) {
    }

    public void N(boolean z10) {
    }

    @Override // L2.AbstractC0886g
    public long e(long j6) {
        return j6;
    }

    @Override // P5.b
    public void o(g gVar) {
    }

    @Override // f3.h
    public void q(long j6) {
    }

    @Override // u3.AbstractC5830c
    public void h(int i10, Object obj) {
    }

    public void O(View view, int i10, int i11) {
    }
}
