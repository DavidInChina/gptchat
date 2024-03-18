package e9;

import Ng.Q;
import Uc.C1422g;
import Uc.EnumC1421f;
import V.B;
import Ya.r;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import cb.C2334C;
import cb.C2362c0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import f4.C2936a;
import f4.q;
import id.AbstractC3557B;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.v;
import l8.AbstractC4344b;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5259e;
import q1.AbstractC5260f;
import q1.C5257c;
import wd.EnumC6181c;
import x8.W;

/* renamed from: e9.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2820m implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final Application f29088a;

    /* renamed from: b  reason: collision with root package name */
    public final t f29089b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4816e f29090c;

    /* renamed from: d  reason: collision with root package name */
    public final Va.e f29091d;

    public C2820m(Application application, t tVar, AbstractC4816e abstractC4816e, Va.e eVar) {
        AbstractC3557B.c0("context", application);
        AbstractC3557B.c0("experimentManager", tVar);
        AbstractC3557B.c0("accountUserProvider", abstractC4816e);
        AbstractC3557B.c0("gizmosRepository", eVar);
        this.f29088a = application;
        this.f29089b = tVar;
        this.f29090c = abstractC4816e;
        this.f29091d = eVar;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0190 -> B:52:0x0193). Please submit an issue!!! */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C2819l c2819l;
        Object obj;
        int i10;
        C2820m c2820m;
        List<C5257c> list;
        List list2;
        int i11;
        Iterator it;
        C5257c[] c5257cArr;
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        IconCompat iconCompat;
        int i12;
        InputStream e10;
        Bitmap decodeStream;
        IconCompat iconCompat2;
        C2820m c2820m2;
        List list3;
        Collection collection;
        Iterator it2;
        C2362c0 c2362c0;
        List list4;
        if (abstractC4825e instanceof C2819l) {
            c2819l = (C2819l) abstractC4825e;
            int i13 = c2819l.f29087l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2819l.f29087l0 = i13 - Integer.MIN_VALUE;
                obj = c2819l.f29085j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2819l.f29087l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                it2 = c2819l.f29084i0;
                                collection = c2819l.f29083h0;
                                list = c2819l.f29082Z;
                                c2820m = c2819l.f29081Y;
                                N.B0(obj);
                                C5257c c5257c = (C5257c) obj;
                                if (c5257c != null) {
                                    collection.add(c5257c);
                                }
                                if (!it2.hasNext()) {
                                    Application application = c2820m.f29088a;
                                    c2819l.f29081Y = c2820m;
                                    c2819l.f29082Z = list;
                                    c2819l.f29083h0 = collection;
                                    c2819l.f29084i0 = it2;
                                    c2819l.f29087l0 = 3;
                                    obj = c2820m.d(application, (C2334C) it2.next(), c2819l);
                                    if (obj == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    C5257c c5257c2 = (C5257c) obj;
                                    if (c5257c2 != null) {
                                    }
                                    if (!it2.hasNext()) {
                                        list2 = (List) collection;
                                        if (list2 == null) {
                                            list3 = list;
                                            c2820m2 = c2820m;
                                            list = list3;
                                            c2820m = c2820m2;
                                            list2 = v.f37483Y;
                                        }
                                        list.addAll(list2);
                                        for (C5257c c5257c3 : list) {
                                            Application application2 = c2820m.f29088a;
                                            application2.getClass();
                                            c5257c3.getClass();
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (i14 >= 25) {
                                                i11 = G1.a.f(application2.getSystemService(G1.a.g())).getMaxShortcutCountPerActivity();
                                            } else {
                                                i11 = 5;
                                            }
                                            if (i11 != 0) {
                                                if (i14 <= 29 && (iconCompat = c5257c3.f43645e) != null && (((i12 = iconCompat.f24917a) == 6 || i12 == 4) && (e10 = iconCompat.e(application2)) != null && (decodeStream = BitmapFactory.decodeStream(e10)) != null)) {
                                                    if (i12 == 6) {
                                                        iconCompat2 = new IconCompat(5);
                                                        iconCompat2.f24918b = decodeStream;
                                                    } else {
                                                        iconCompat2 = new IconCompat(1);
                                                        iconCompat2.f24918b = decodeStream;
                                                    }
                                                    c5257c3.f43645e = iconCompat2;
                                                }
                                                if (i14 >= 30) {
                                                    G1.a.f(application2.getSystemService(G1.a.g())).pushDynamicShortcut(c5257c3.a());
                                                } else if (i14 >= 25) {
                                                    ShortcutManager f6 = G1.a.f(application2.getSystemService(G1.a.g()));
                                                    isRateLimitingActive = f6.isRateLimitingActive();
                                                    if (!isRateLimitingActive) {
                                                        dynamicShortcuts = f6.getDynamicShortcuts();
                                                        if (dynamicShortcuts.size() >= i11) {
                                                            f6.removeDynamicShortcuts(Arrays.asList(AbstractC5259e.a(dynamicShortcuts)));
                                                        }
                                                        f6.addDynamicShortcuts(Arrays.asList(c5257c3.a()));
                                                    }
                                                }
                                                try {
                                                    try {
                                                        AbstractC5260f.w(application2).getClass();
                                                        ArrayList arrayList = new ArrayList();
                                                        if (arrayList.size() >= i11) {
                                                            String[] strArr = new String[1];
                                                            Iterator it3 = arrayList.iterator();
                                                            char c10 = '\uffff';
                                                            String str = null;
                                                            while (it3.hasNext()) {
                                                                C5257c c5257c4 = (C5257c) it3.next();
                                                                c5257c4.getClass();
                                                                if (c10 < 0) {
                                                                    str = c5257c4.f43642b;
                                                                    c10 = 0;
                                                                }
                                                            }
                                                            try {
                                                                strArr[0] = str;
                                                                Arrays.asList(strArr);
                                                            } catch (Exception unused) {
                                                                it = ((ArrayList) AbstractC5260f.v(application2)).iterator();
                                                                if (it.hasNext()) {
                                                                    AbstractC2469q0.p(it.next());
                                                                    Collections.singletonList(c5257c3);
                                                                    throw null;
                                                                }
                                                                AbstractC5260f.L(application2, c5257c3.f43642b);
                                                            }
                                                        }
                                                        c5257cArr = new C5257c[1];
                                                    } catch (Exception unused2) {
                                                    }
                                                    try {
                                                        c5257cArr[0] = c5257c3;
                                                        Arrays.asList(c5257cArr);
                                                        Iterator it4 = ((ArrayList) AbstractC5260f.v(application2)).iterator();
                                                        if (it4.hasNext()) {
                                                            AbstractC2469q0.p(it4.next());
                                                            Collections.singletonList(c5257c3);
                                                            throw null;
                                                        }
                                                    } catch (Exception unused3) {
                                                        it = ((ArrayList) AbstractC5260f.v(application2)).iterator();
                                                        if (it.hasNext()) {
                                                        }
                                                        AbstractC5260f.L(application2, c5257c3.f43642b);
                                                    }
                                                    AbstractC5260f.L(application2, c5257c3.f43642b);
                                                } catch (Throwable th2) {
                                                    Iterator it5 = ((ArrayList) AbstractC5260f.v(application2)).iterator();
                                                    if (it5.hasNext()) {
                                                        AbstractC2469q0.p(it5.next());
                                                        Collections.singletonList(c5257c3);
                                                        throw null;
                                                    }
                                                    AbstractC5260f.L(application2, c5257c3.f43642b);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        return y.f36177a;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            list3 = c2819l.f29082Z;
                            c2820m2 = c2819l.f29081Y;
                            N.B0(obj);
                            c2362c0 = (C2362c0) obj;
                            if (c2362c0 != null && (list4 = c2362c0.f26510a) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list4) {
                                    if (((C2334C) obj2).d()) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                List G22 = kf.t.G2(arrayList2, 4);
                                ArrayList arrayList3 = new ArrayList();
                                list = list3;
                                c2820m = c2820m2;
                                it2 = G22.iterator();
                                collection = arrayList3;
                                if (!it2.hasNext()) {
                                }
                            }
                            list = list3;
                            c2820m = c2820m2;
                            list2 = v.f37483Y;
                            list.addAll(list2);
                            while (r0.hasNext()) {
                            }
                            return y.f36177a;
                        }
                    } else {
                        c2820m2 = c2819l.f29081Y;
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    int i15 = Build.VERSION.SDK_INT;
                    Application application3 = this.f29088a;
                    if (i15 >= 25) {
                        G1.a.f(application3.getSystemService(G1.a.g())).removeAllDynamicShortcuts();
                    }
                    AbstractC5260f.w(application3).getClass();
                    Iterator it6 = ((ArrayList) AbstractC5260f.v(application3)).iterator();
                    if (!it6.hasNext()) {
                        ExperimentKey.ShortcutsEnabled shortcutsEnabled = ExperimentKey.ShortcutsEnabled.INSTANCE;
                        c2819l.f29081Y = this;
                        c2819l.f29087l0 = 1;
                        G g10 = (G) this.f29089b;
                        g10.getClass();
                        obj = G.d(g10, shortcutsEnabled, c2819l);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c2820m2 = this;
                    } else {
                        AbstractC2469q0.p(it6.next());
                        throw null;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC4816e abstractC4816e = c2820m2.f29090c;
                    Wc.d dVar = EnumC6181c.f48384Z;
                    if (((xc.e) abstractC4816e).b(ExperimentKey.BreezeEnabled.INSTANCE)) {
                        Application application4 = c2820m2.f29088a;
                        B b10 = new B(application4, "voice_mode_ongoing");
                        C1422g c1422g = C1422g.f17674i;
                        Intent D6 = W.D(application4, C1422g.r1(EnumC1421f.f17668Y), AbstractC4344b.G0(268435456, 131072));
                        AbstractC3557B.Z(D6);
                        Intent[] intentArr = {D6};
                        Object obj3 = b10.f17895b;
                        ((C5257c) obj3).f43643c = intentArr;
                        PorterDuff.Mode mode = IconCompat.f24916k;
                        ((C5257c) obj3).f43645e = IconCompat.b(application4.getResources(), application4.getPackageName(), R.mipmap.ic_bubble);
                        ((C5257c) obj3).f43648h = true;
                        ((C5257c) obj3).f43644d = application4.getString(R.string.voice_shortcut);
                        C5257c a5 = b10.a();
                        AbstractC3557B.b0("build(...)", a5);
                        arrayList4.add(a5);
                    }
                    Ia.j jVar = ((r) c2820m2.f29091d).f22204c;
                    c2819l.f29081Y = c2820m2;
                    c2819l.f29082Z = arrayList4;
                    c2819l.f29087l0 = 2;
                    Object o02 = L4.a.o0(jVar, c2819l);
                    if (o02 == enumC5000a) {
                        return enumC5000a;
                    }
                    list3 = arrayList4;
                    obj = o02;
                    c2362c0 = (C2362c0) obj;
                    if (c2362c0 != null) {
                        ArrayList arrayList22 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        List G222 = kf.t.G2(arrayList22, 4);
                        ArrayList arrayList32 = new ArrayList();
                        list = list3;
                        c2820m = c2820m2;
                        it2 = G222.iterator();
                        collection = arrayList32;
                        if (!it2.hasNext()) {
                        }
                    }
                    list = list3;
                    c2820m = c2820m2;
                    list2 = v.f37483Y;
                    list.addAll(list2);
                    while (r0.hasNext()) {
                    }
                }
                return y.f36177a;
            }
        }
        c2819l = new C2819l(this, abstractC4825e);
        obj = c2819l.f29085j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2819l.f29087l0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Application application, C2334C c2334c, AbstractC4825e abstractC4825e) {
        C2817j c2817j;
        int i10;
        IconCompat iconCompat;
        if (abstractC4825e instanceof C2817j) {
            c2817j = (C2817j) abstractC4825e;
            int i11 = c2817j.f29077j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2817j.f29077j0 = i11 - Integer.MIN_VALUE;
                Object obj = c2817j.f29075h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c2817j.f29077j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2334c = c2817j.f29074Z;
                        application = c2817j.f29073Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c2817j.f29073Y = application;
                    c2817j.f29074Z = c2334c;
                    c2817j.f29077j0 = 1;
                    obj = e(application, c2334c, c2817j);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                iconCompat = (IconCompat) obj;
                if (iconCompat != null) {
                    return null;
                }
                B b10 = new B(application, c2334c.f26438a);
                Intent intent = new Intent();
                A7.b.G0(intent, "https://chatgpt.com/g/" + c2334c.f26438a);
                Intent[] intentArr = {intent};
                Object obj3 = b10.f17895b;
                ((C5257c) obj3).f43643c = intentArr;
                ((C5257c) obj3).f43645e = iconCompat;
                ((C5257c) obj3).f43648h = true;
                ((C5257c) obj3).f43644d = c2334c.f26439b;
                return b10.a();
            }
        }
        c2817j = new C2817j(this, abstractC4825e);
        Object obj4 = c2817j.f29075h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c2817j.f29077j0;
        if (i10 == 0) {
        }
        iconCompat = (IconCompat) obj4;
        if (iconCompat != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Application application, C2334C c2334c, AbstractC4825e abstractC4825e) {
        C2818k c2818k;
        int i10;
        q4.k kVar;
        Bitmap bitmap;
        if (abstractC4825e instanceof C2818k) {
            c2818k = (C2818k) abstractC4825e;
            int i11 = c2818k.f29080h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2818k.f29080h0 = i11 - Integer.MIN_VALUE;
                Object obj = c2818k.f29078Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2818k.f29080h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    q4.h hVar = new q4.h(application);
                    hVar.f43805c = c2334c.f26445h.f26518a;
                    q4.j a5 = hVar.a();
                    q a10 = C2936a.a(application);
                    c2818k.f29080h0 = 1;
                    obj = a10.b(a5, c2818k);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                kVar = (q4.k) obj;
                if (!(kVar instanceof q4.q)) {
                    Drawable drawable = ((q4.q) kVar).f43886a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (drawable instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                        if (bitmapDrawable.getBitmap() != null) {
                            if (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) {
                                bitmap = bitmapDrawable.getBitmap();
                            } else {
                                bitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                            }
                        } else {
                            throw new IllegalArgumentException("bitmap is null");
                        }
                    } else {
                        Rect bounds = drawable.getBounds();
                        int i12 = bounds.left;
                        int i13 = bounds.top;
                        int i14 = bounds.right;
                        int i15 = bounds.bottom;
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        drawable.draw(new Canvas(createBitmap));
                        drawable.setBounds(i12, i13, i14, i15);
                        bitmap = createBitmap;
                    }
                    PorterDuff.Mode mode = IconCompat.f24916k;
                    bitmap.getClass();
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f24918b = bitmap;
                    return iconCompat;
                }
                return null;
            }
        }
        c2818k = new C2818k(this, abstractC4825e);
        Object obj2 = c2818k.f29078Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2818k.f29080h0;
        if (i10 == 0) {
        }
        kVar = (q4.k) obj2;
        if (!(kVar instanceof q4.q)) {
        }
    }
}
