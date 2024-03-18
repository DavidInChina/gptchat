package db;

import android.net.Uri;
import gb.C3234k;
import gb.b0;
import id.AbstractC3557B;
import kb.C4226k;
import kb.C4228m;
import kb.C4231p;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import nc.m;
import wd.O;
import wf.AbstractC6216a;
import wf.k;

/* renamed from: db.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2615c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28178Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f28179Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f28180h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2615c(String str, k kVar) {
        super(0);
        this.f28178Y = 4;
        this.f28180h0 = str;
        this.f28179Z = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2615c(k kVar, String str, int i10) {
        super(0);
        this.f28178Y = i10;
        this.f28179Z = kVar;
        this.f28180h0 = str;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f28178Y;
        k kVar = this.f28179Z;
        String str = this.f28180h0;
        switch (i10) {
            case 0:
                kVar.invoke(new O(str));
                return;
            case 1:
                Uri parse = Uri.parse(str);
                AbstractC3557B.b0("parse(...)", parse);
                kVar.invoke(new C4231p(parse));
                return;
            case 2:
                AbstractC3557B.c0("value", str);
                kVar.invoke(new C4226k(str));
                return;
            case 3:
                AbstractC3557B.c0("value", str);
                kVar.invoke(new C4228m(str));
                return;
            case 4:
                kVar.invoke(new b0(0, AbstractC4344b.F0(new C3234k(str, null))));
                return;
            case 5:
                kVar.invoke(str);
                return;
            case 6:
                if (kVar == null) {
                    return;
                }
                kVar.invoke(str);
                return;
            default:
                kVar.invoke(new m(str));
                return;
        }
    }
}
