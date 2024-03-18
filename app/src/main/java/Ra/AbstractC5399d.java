package ra;

import Tc.f;
import Z.AbstractC1725n;
import Z.C1741v0;
import Z.r;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import na.C4774n;

/* renamed from: ra.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5399d {

    /* renamed from: a  reason: collision with root package name */
    public static final List f44644a = AbstractC4344b.G0("Summer rain echoes\nPattering on the rooftops\nDreams washed away too\n", "Under a full moon\nThe night's secrets softly speak\nWhispering in light\n", "Petals in the wind\nFluttering like butterflies\nFarewell to spring's song\n", "Glittering snowfall\nWinter's icy touch adorns\nEarth in silver robes\n", "On an autumn eve\nCrimson leaves perform ballet\nDancing with the breeze\n", "In the city's heart\nNeon lights reflect on glass\nNight finds a new dawn\n", "Mountain's mighty peak\nBeneath the vast canvas sky\nTimeless, it stands firm\n", "Ocean's melody\nIn each wave, the world's rhythm\nSymphony of life\n", "Sun sets, stars emerge\nThe cosmos unfolds its tale\nNight's silent poem\n", "Dew-kissed morning grass\nCrisp beneath the newborn sun\nDay's first sigh of life\n");

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f fVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        AbstractC4326r abstractC4326r4;
        int i13;
        int i14;
        AbstractC3557B.c0("appState", fVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("EasterEggScreen");
        r rVar = (r) abstractC1725n;
        rVar.X(1960790540);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(fVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i15 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                int i16 = 199688 | (i12 & 14) | (i12 & 112);
                K8.d.o(fVar, abstractC4326r4, 0L, R4.b.X(rVar, 79941718, new F9.f(fVar, 3)), false, AbstractC5398c.f44643b, rVar, i16, 20);
                abstractC4326r3 = abstractC4326r4;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C4774n(fVar, abstractC4326r3, i10, i11, 2);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        int i162 = 199688 | (i12 & 14) | (i12 & 112);
        K8.d.o(fVar, abstractC4326r4, 0L, R4.b.X(rVar, 79941718, new F9.f(fVar, 3)), false, AbstractC5398c.f44643b, rVar, i162, 20);
        abstractC4326r3 = abstractC4326r4;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
