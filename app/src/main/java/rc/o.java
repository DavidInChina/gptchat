package Rc;

import Sc.p;
import Sc.s;
import Sc.u;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Collection;
import kf.t;
import kf.v;

@AbstractC1998i
/* loaded from: classes.dex */
public final class o {
    public static final n Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final f f15417a;

    public o(int i10, f fVar) {
        if ((i10 & 1) == 0) {
            this.f15417a = null;
        } else {
            this.f15417a = fVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a() {
        s sVar;
        p pVar;
        Collection collection;
        Collection collection2;
        f fVar = this.f15417a;
        if (fVar != null) {
            String str = fVar.f15390a;
            int hashCode = str.hashCode();
            if (hashCode != -1021130956) {
                if (hashCode != -383989976) {
                    if (hashCode == 1262387476 && str.equals("multimodal")) {
                        pVar = p.f16545h0;
                        Collection collection3 = v.f37483Y;
                        collection = fVar.f15391b;
                        if (collection == null) {
                            collection = collection3;
                        }
                        collection2 = fVar.f15392c;
                        if (collection2 != null) {
                            collection3 = collection2;
                        }
                        sVar = new s(pVar, t.w2(collection3, collection));
                    }
                    pVar = p.f16546i0;
                    Collection collection32 = v.f37483Y;
                    collection = fVar.f15391b;
                    if (collection == null) {
                    }
                    collection2 = fVar.f15392c;
                    if (collection2 != null) {
                    }
                    sVar = new s(pVar, t.w2(collection32, collection));
                } else {
                    if (str.equals("code_interpreter")) {
                        pVar = p.f16544Z;
                        Collection collection322 = v.f37483Y;
                        collection = fVar.f15391b;
                        if (collection == null) {
                        }
                        collection2 = fVar.f15392c;
                        if (collection2 != null) {
                        }
                        sVar = new s(pVar, t.w2(collection322, collection));
                    }
                    pVar = p.f16546i0;
                    Collection collection3222 = v.f37483Y;
                    collection = fVar.f15391b;
                    if (collection == null) {
                    }
                    collection2 = fVar.f15392c;
                    if (collection2 != null) {
                    }
                    sVar = new s(pVar, t.w2(collection3222, collection));
                }
            } else {
                if (str.equals("retrieval")) {
                    pVar = p.f16543Y;
                    Collection collection32222 = v.f37483Y;
                    collection = fVar.f15391b;
                    if (collection == null) {
                    }
                    collection2 = fVar.f15392c;
                    if (collection2 != null) {
                    }
                    sVar = new s(pVar, t.w2(collection32222, collection));
                }
                pVar = p.f16546i0;
                Collection collection322222 = v.f37483Y;
                collection = fVar.f15391b;
                if (collection == null) {
                }
                collection2 = fVar.f15392c;
                if (collection2 != null) {
                }
                sVar = new s(pVar, t.w2(collection322222, collection));
            }
        } else {
            sVar = null;
        }
        return new u(sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && AbstractC3557B.K(this.f15417a, ((o) obj).f15417a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        f fVar = this.f15417a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "ModelsResponseProductFeatures(attachments=" + this.f15417a + Separators.RPAREN;
    }
}
