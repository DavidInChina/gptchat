package o1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Iterator;
import t1.AbstractC5658d;
import w.C6060g;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f40487a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f40491e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f40492f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f40493g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f40496j;

    /* renamed from: k  reason: collision with root package name */
    public w f40497k;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f40499m;

    /* renamed from: o  reason: collision with root package name */
    public String f40501o;

    /* renamed from: q  reason: collision with root package name */
    public final Notification f40503q;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f40488b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f40489c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f40490d = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final boolean f40495i = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f40498l = false;

    /* renamed from: n  reason: collision with root package name */
    public int f40500n = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f40494h = 0;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f40504r = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final boolean f40502p = true;

    public v(Context context, String str) {
        Notification notification = new Notification();
        this.f40503q = notification;
        this.f40487a = context;
        this.f40501o = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence, android.net.Uri, long[], java.lang.String] */
    public final Notification a() {
        Notification.Builder builder;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r42;
        Notification notification;
        Bundle bundle;
        ArrayList arrayList;
        int i10;
        Bundle bundle2;
        Bundle[] bundleArr;
        int i11;
        ArrayList arrayList2;
        Icon icon;
        Bundle bundle3;
        int i12;
        new ArrayList();
        Bundle bundle4 = new Bundle();
        Context context = this.f40487a;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = AbstractC4881E.a(context, this.f40501o);
        } else {
            builder = new Notification.Builder(this.f40487a);
        }
        Notification notification2 = this.f40503q;
        Notification.Builder lights = builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS);
        boolean z13 = true;
        if ((notification2.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification2.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification2.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification2.defaults).setContentTitle(this.f40491e).setContentText(this.f40492f).setContentInfo(null).setContentIntent(this.f40493g).setDeleteIntent(notification2.deleteIntent);
        if ((notification2.flags & 128) == 0) {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(null, z13).setNumber(0).setProgress(0, 0, false);
        AbstractC4879C.b(builder, null);
        x.b(x.d(x.c(builder, null), this.f40496j), this.f40494h);
        Iterator it = this.f40488b.iterator();
        while (it.hasNext()) {
            C4903s c4903s = (C4903s) it.next();
            if (c4903s.f40476b == null && (i12 = c4903s.f40482h) != 0) {
                c4903s.f40476b = IconCompat.b(null, "", i12);
            }
            IconCompat iconCompat = c4903s.f40476b;
            if (iconCompat != null) {
                icon = AbstractC5658d.c(iconCompat, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder a5 = AbstractC4879C.a(icon, c4903s.f40483i, c4903s.f40484j);
            Q[] qArr = c4903s.f40477c;
            if (qArr != null) {
                int length = qArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (qArr.length <= 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        AbstractC4877A.c(a5, remoteInputArr[i13]);
                    }
                } else {
                    Q q10 = qArr[0];
                    throw null;
                }
            }
            Bundle bundle5 = c4903s.f40475a;
            if (bundle5 != null) {
                bundle3 = new Bundle(bundle5);
            } else {
                bundle3 = new Bundle();
            }
            boolean z14 = c4903s.f40478d;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z14);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                AbstractC4880D.a(a5, z14);
            }
            int i15 = c4903s.f40480f;
            bundle3.putInt("android.support.action.semanticAction", i15);
            if (i14 >= 28) {
                AbstractC4882F.b(a5, i15);
            }
            if (i14 >= 29) {
                AbstractC4883G.c(a5, c4903s.f40481g);
            }
            if (i14 >= 31) {
                AbstractC4884H.a(a5, c4903s.f40485k);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c4903s.f40479e);
            AbstractC4877A.b(a5, bundle3);
            AbstractC4877A.a(builder, AbstractC4877A.d(a5));
        }
        Bundle bundle6 = this.f40499m;
        if (bundle6 != null) {
            bundle4.putAll(bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        y.a(builder, this.f40495i);
        AbstractC4877A.i(builder, this.f40498l);
        AbstractC4877A.g(builder, null);
        AbstractC4877A.j(builder, null);
        AbstractC4877A.h(builder, false);
        AbstractC4878B.b(builder, null);
        AbstractC4878B.c(builder, 0);
        AbstractC4878B.f(builder, this.f40500n);
        AbstractC4878B.d(builder, null);
        AbstractC4878B.e(builder, notification2.sound, notification2.audioAttributes);
        ArrayList<String> arrayList3 = this.f40504r;
        ArrayList arrayList4 = this.f40489c;
        if (i16 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    AbstractC2469q0.p(it2.next());
                    throw null;
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    C6060g c6060g = new C6060g(arrayList3.size() + arrayList2.size());
                    c6060g.addAll(arrayList2);
                    c6060g.addAll(arrayList3);
                    arrayList3 = new ArrayList(c6060g);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            for (String str : arrayList3) {
                AbstractC4878B.a(builder, str);
            }
        }
        ArrayList arrayList5 = this.f40490d;
        if (arrayList5.size() > 0) {
            if (this.f40499m == null) {
                this.f40499m = new Bundle();
            }
            Bundle bundle7 = this.f40499m.getBundle("android.car.EXTENSIONS");
            if (bundle7 == null) {
                bundle7 = new Bundle();
            }
            Bundle bundle8 = new Bundle(bundle7);
            Bundle bundle9 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                String num = Integer.toString(i17);
                C4903s c4903s2 = (C4903s) arrayList5.get(i17);
                Object obj = J.f40445a;
                Bundle bundle10 = new Bundle();
                if (c4903s2.f40476b == null && (i11 = c4903s2.f40482h) != 0) {
                    arrayList = arrayList5;
                    c4903s2.f40476b = IconCompat.b(null, "", i11);
                } else {
                    arrayList = arrayList5;
                }
                IconCompat iconCompat2 = c4903s2.f40476b;
                if (iconCompat2 != null) {
                    i10 = iconCompat2.c();
                } else {
                    i10 = 0;
                }
                bundle10.putInt(ParameterNames.ICON, i10);
                bundle10.putCharSequence("title", c4903s2.f40483i);
                bundle10.putParcelable("actionIntent", c4903s2.f40484j);
                Bundle bundle11 = c4903s2.f40475a;
                if (bundle11 != null) {
                    bundle2 = new Bundle(bundle11);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", c4903s2.f40478d);
                bundle10.putBundle("extras", bundle2);
                Q[] qArr2 = c4903s2.f40477c;
                if (qArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[qArr2.length];
                    if (qArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        Q q11 = qArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle10.putParcelableArray("remoteInputs", bundleArr);
                bundle10.putBoolean("showsUserInterface", c4903s2.f40479e);
                bundle10.putInt("semanticAction", c4903s2.f40480f);
                bundle9.putBundle(num, bundle10);
                i17++;
                arrayList5 = arrayList;
            }
            bundle7.putBundle("invisible_actions", bundle9);
            bundle8.putBundle("invisible_actions", bundle9);
            if (this.f40499m == null) {
                this.f40499m = new Bundle();
            }
            this.f40499m.putBundle("android.car.EXTENSIONS", bundle7);
            bundle4.putBundle("android.car.EXTENSIONS", bundle8);
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 24) {
            z.a(builder, this.f40499m);
            r42 = 0;
            AbstractC4880D.e(builder, null);
        } else {
            r42 = 0;
        }
        if (i18 >= 26) {
            AbstractC4881E.b(builder, 0);
            AbstractC4881E.e(builder, r42);
            AbstractC4881E.f(builder, r42);
            AbstractC4881E.g(builder, 0L);
            AbstractC4881E.d(builder, 0);
            if (!TextUtils.isEmpty(this.f40501o)) {
                builder.setSound(r42).setDefaults(0).setLights(0, 0, 0).setVibrate(r42);
            }
        }
        if (i18 >= 28) {
            Iterator it3 = arrayList4.iterator();
            if (it3.hasNext()) {
                AbstractC2469q0.p(it3.next());
                throw null;
            }
        }
        if (i18 >= 29) {
            AbstractC4883G.a(builder, this.f40502p);
            AbstractC4883G.b(builder, null);
        }
        w wVar = this.f40497k;
        if (wVar != null) {
            t.a(t.c(t.b(builder), null), ((u) wVar).f40486b);
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            notification = x.a(builder);
        } else if (i19 >= 24) {
            notification = x.a(builder);
        } else {
            z.a(builder, bundle4);
            notification = x.a(builder);
        }
        if (wVar != null) {
            this.f40497k.getClass();
        }
        if (wVar != null && (bundle = notification.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notification;
    }

    public final void c(u uVar) {
        if (this.f40497k != uVar) {
            this.f40497k = uVar;
            if (uVar.f40505a != this) {
                uVar.f40505a = this;
                c(uVar);
            }
        }
    }
}
