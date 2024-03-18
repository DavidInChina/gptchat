package g4;

import android.graphics.ColorSpace;
import id.AbstractC3557B;
import java.util.Arrays;
import k6.AbstractC4194d;

/* renamed from: g4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3191s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f31254a;

    /* renamed from: b  reason: collision with root package name */
    public final C3196x f31255b;

    /* renamed from: c  reason: collision with root package name */
    public final f4.i f31256c;

    public C3191s(Object obj, C3196x c3196x, f4.i iVar) {
        this.f31254a = obj;
        this.f31255b = c3196x;
        this.f31256c = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
        if (id.AbstractC3557B.K(r2.f43832D, r1.f43832D) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
        if (id.AbstractC3557B.K(r2, r1) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3191s) {
            C3191s c3191s = (C3191s) obj;
            Object obj2 = c3191s.f31254a;
            this.f31255b.getClass();
            Object obj3 = this.f31254a;
            if (obj3 != obj2) {
                if ((obj3 instanceof q4.j) && (obj2 instanceof q4.j)) {
                    q4.j jVar = (q4.j) obj3;
                    q4.j jVar2 = (q4.j) obj2;
                    if (AbstractC3557B.K(jVar.f43842a, jVar2.f43842a)) {
                        if (AbstractC3557B.K(jVar.f43843b, jVar2.f43843b)) {
                            if (AbstractC3557B.K(jVar.f43833E, jVar2.f43833E)) {
                                if (AbstractC3557B.K(jVar.f43846e, jVar2.f43846e)) {
                                    if (AbstractC3557B.K(jVar.f43847f, jVar2.f43847f)) {
                                        if (jVar.f43848g == jVar2.f43848g) {
                                            if (AbstractC3557B.K(jVar.f43849h, jVar2.f43849h)) {
                                                if (AbstractC3557B.K(jVar.f43853l, jVar2.f43853l)) {
                                                    if (AbstractC3557B.K(jVar.f43855n, jVar2.f43855n)) {
                                                        if (jVar.f43857p == jVar2.f43857p) {
                                                            if (jVar.f43858q == jVar2.f43858q) {
                                                                if (jVar.f43859r == jVar2.f43859r) {
                                                                    if (jVar.f43860s == jVar2.f43860s) {
                                                                        if (jVar.f43861t == jVar2.f43861t) {
                                                                            if (jVar.f43862u == jVar2.f43862u) {
                                                                                if (jVar.f43863v == jVar2.f43863v) {
                                                                                    if (AbstractC3557B.K(jVar.f43830B, jVar2.f43830B)) {
                                                                                        if (jVar.f43831C == jVar2.f43831C) {
                                                                                            if (jVar.f43850i == jVar2.f43850i) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (AbstractC3557B.K(this.f31256c, c3191s.f31256c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f31255b.getClass();
        Object obj = this.f31254a;
        int i16 = 0;
        if (!(obj instanceof q4.j)) {
            if (obj != null) {
                i16 = obj.hashCode();
            }
        } else {
            q4.j jVar = (q4.j) obj;
            int hashCode = (jVar.f43843b.hashCode() + (jVar.f43842a.hashCode() * 31)) * 31;
            o4.c cVar = jVar.f43833E;
            if (cVar != null) {
                i10 = cVar.hashCode();
            } else {
                i10 = 0;
            }
            int i17 = (hashCode + i10) * 31;
            o4.c cVar2 = jVar.f43846e;
            if (cVar2 != null) {
                i11 = cVar2.hashCode();
            } else {
                i11 = 0;
            }
            int i18 = (i17 + i11) * 31;
            String str = jVar.f43847f;
            if (str != null) {
                i12 = str.hashCode();
            } else {
                i12 = 0;
            }
            int hashCode2 = (jVar.f43848g.hashCode() + ((i18 + i12) * 31)) * 31;
            ColorSpace colorSpace = jVar.f43849h;
            if (colorSpace != null) {
                i16 = colorSpace.hashCode();
            }
            int s10 = (AbstractC4194d.s(jVar.f43853l, (hashCode2 + i16) * 31, 31) + Arrays.hashCode(jVar.f43855n.f21240Y)) * 31;
            int i19 = 1237;
            if (jVar.f43857p) {
                i13 = 1231;
            } else {
                i13 = 1237;
            }
            int i20 = (s10 + i13) * 31;
            if (jVar.f43858q) {
                i14 = 1231;
            } else {
                i14 = 1237;
            }
            int i21 = (i20 + i14) * 31;
            if (jVar.f43859r) {
                i15 = 1231;
            } else {
                i15 = 1237;
            }
            int i22 = (i21 + i15) * 31;
            if (jVar.f43860s) {
                i19 = 1231;
            }
            int hashCode3 = jVar.f43861t.hashCode();
            int hashCode4 = jVar.f43862u.hashCode();
            int hashCode5 = jVar.f43863v.hashCode();
            int hashCode6 = jVar.f43830B.hashCode();
            int hashCode7 = jVar.f43831C.hashCode();
            i16 = jVar.f43832D.f43885Y.hashCode() + ((jVar.f43850i.hashCode() + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((i22 + i19) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.f31256c.hashCode() + (i16 * 31);
    }
}
