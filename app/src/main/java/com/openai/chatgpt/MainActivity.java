package com.openai.chatgpt;

import A1.e;
import Ad.l;
import D1.AbstractC0362l0;
import D1.AbstractC0364m0;
import Lg.n;
import Qg.n0;
import R4.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.pairip.licensecheck3.LicenseClientV3;
import d9.C2608c;
import d9.C2609d;
import f9.AbstractC2949a;
import f9.C2954f;
import f9.p;
import f9.w;
import g9.AbstractC3215f;
import g9.C3220k;
import h.AbstractC3284j;
import h0.C3288a;
import id.AbstractC3557B;
import jf.C3963m;
import k9.c;
import kotlin.Metadata;
import m.AbstractActivityC4532l;
import m.AbstractC4537q;
import nf.C4832l;
import p1.k;
import pd.d;
import pd.g;
import vd.AbstractC6030e;
import vd.EnumC6026a;
import xa.u;
import y.C6473k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/openai/chatgpt/MainActivity;", "Lm/l;", "<init>", "()V", "app_googlePlayRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC4532l {

    /* renamed from: F0  reason: collision with root package name */
    public final C3963m f27651F0 = b.D1(C2608c.f28128Z);

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((g) ((p) this.f27651F0.getValue()).Q.get()).j(new d(intent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        w wVar;
        zd.d dVar;
        int i10;
        C2954f c2954f;
        n0 n0Var;
        AbstractC2949a abstractC2949a;
        if (Build.VERSION.SDK_INT < 31) {
            AbstractC3215f abstractC3215f = (AbstractC3215f) ((C3220k) ((p) this.f27651F0.getValue()).f29880G.get()).f31338g.f14881Y.getValue();
            if (abstractC3215f instanceof w) {
                wVar = (w) abstractC3215f;
            } else {
                wVar = null;
            }
            if (wVar != null && (c2954f = (C2954f) wVar.f29979j.get()) != null && (n0Var = c2954f.f29786d) != null && (abstractC2949a = (AbstractC2949a) n0Var.f14881Y.getValue()) != null) {
                dVar = (zd.d) l.a1(C4832l.f40334Y, new C2609d(abstractC2949a, null));
            }
            dVar = zd.d.f51960Y;
            int ordinal = dVar.ordinal();
            if (ordinal != 0) {
                i10 = 1;
                if (ordinal != 1) {
                    i10 = 2;
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                }
            } else {
                i10 = -1;
            }
            AbstractC4537q.k(i10);
        }
    }

    @Override // V1.AbstractActivityC1483y, g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e eVar;
        String stringExtra;
        Object obj;
        LicenseClientV3.onActivityCreate(this);
        c a5 = ((k9.d) AbstractC6030e.a()).a(EnumC6026a.f47470Y);
        try {
            a5.b();
            p();
            if (Build.VERSION.SDK_INT >= 31) {
                eVar = new A1.d(this);
            } else {
                eVar = new e(this);
            }
            eVar.a();
            super.onCreate(bundle);
            Window window = getWindow();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                AbstractC0364m0.a(window, false);
            } else {
                AbstractC0362l0.a(window, false);
            }
            if (bundle == null && AbstractC3557B.K(getIntent().getAction(), "android.intent.action.SEND")) {
                String type = getIntent().getType();
                C3963m c3963m = this.f27651F0;
                if (type != null && n.I2(type, "image/", false)) {
                    Intent intent = getIntent();
                    if (i10 >= 34) {
                        obj = k.c(intent, "android.intent.extra.STREAM", Uri.class);
                    } else {
                        obj = intent.getParcelableExtra("android.intent.extra.STREAM");
                        if (!Uri.class.isInstance(obj)) {
                            obj = null;
                        }
                    }
                    ((u) ((Ea.c) ((p) c3963m.getValue()).f29903d0.get())).f49776a = (Uri) obj;
                } else {
                    String type2 = getIntent().getType();
                    if (type2 != null && type2.equals("text/plain") && (stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT")) != null && !n.n2(stringExtra)) {
                        u uVar = (u) ((Ea.c) ((p) c3963m.getValue()).f29903d0.get());
                        uVar.getClass();
                        uVar.f49777b = stringExtra;
                    }
                }
            }
            AbstractC3284j.a(this, new C3288a(new C6473k(15, this), true, -1805908116));
            a5.a();
        } catch (Throwable th2) {
            a5.a();
            throw th2;
        }
    }
}
