package i4;

import B2.E;
import java.io.IOException;
import java.util.ArrayList;
import ji.C4113B;

/* renamed from: i4.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3472e {

    /* renamed from: a  reason: collision with root package name */
    public final String f32667a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f32668b = new long[2];

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f32669c = new ArrayList(2);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f32670d = new ArrayList(2);

    /* renamed from: e  reason: collision with root package name */
    public boolean f32671e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f32672f;

    /* renamed from: g  reason: collision with root package name */
    public E f32673g;

    /* renamed from: h  reason: collision with root package name */
    public int f32674h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f32675i;

    public C3472e(i iVar, String str) {
        this.f32675i = iVar;
        this.f32667a = str;
        iVar.getClass();
        iVar.getClass();
        iVar.getClass();
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        iVar.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f32669c.add(this.f32675i.f32682Y.d(sb2.toString()));
            sb2.append(".tmp");
            this.f32670d.add(this.f32675i.f32682Y.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final C3473f a() {
        if (!this.f32671e || this.f32673g != null || this.f32672f) {
            return null;
        }
        ArrayList arrayList = this.f32669c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i iVar = this.f32675i;
            if (i10 < size) {
                if (!iVar.f32697u0.f((C4113B) arrayList.get(i10))) {
                    try {
                        iVar.P(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i10++;
            } else {
                this.f32674h++;
                return new C3473f(iVar, this);
            }
        }
    }
}
