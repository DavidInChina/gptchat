package e3;

import android.gov.nist.core.Separators;
import s2.u;
import x2.AbstractC6266a;
import x8.N;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f28865a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f28866b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static Y2.e a(int i10, u uVar) {
        int g10 = uVar.g();
        if (uVar.g() == 1684108385) {
            uVar.G(8);
            String q10 = uVar.q(g10 - 16);
            return new Y2.e("und", q10, q10);
        }
        s2.p.g("MetadataUtil", "Failed to parse comment attribute: " + AbstractC6266a.f(i10));
        return null;
    }

    public static Y2.a b(u uVar) {
        String str;
        int g10 = uVar.g();
        if (uVar.g() == 1684108385) {
            int g11 = uVar.g() & 16777215;
            if (g11 == 13) {
                str = "image/jpeg";
            } else if (g11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                android.gov.nist.core.a.v("Unrecognized cover art flags: ", g11, "MetadataUtil");
                return null;
            }
            uVar.G(4);
            int i10 = g10 - 16;
            byte[] bArr = new byte[i10];
            uVar.e(bArr, 0, i10);
            return new Y2.a(str, null, 3, bArr);
        }
        s2.p.g("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static Y2.o c(int i10, u uVar, String str) {
        int g10 = uVar.g();
        if (uVar.g() == 1684108385 && g10 >= 22) {
            uVar.G(10);
            int z10 = uVar.z();
            if (z10 > 0) {
                String e10 = android.gov.nist.core.a.e("", z10);
                int z11 = uVar.z();
                if (z11 > 0) {
                    e10 = e10 + Separators.SLASH + z11;
                }
                return new Y2.o(str, null, N.u0(e10));
            }
        }
        s2.p.g("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC6266a.f(i10));
        return null;
    }

    public static Y2.o d(int i10, u uVar, String str) {
        int g10 = uVar.g();
        if (uVar.g() == 1684108385) {
            uVar.G(8);
            return new Y2.o(str, null, N.u0(uVar.q(g10 - 16)));
        }
        s2.p.g("MetadataUtil", "Failed to parse text attribute: " + AbstractC6266a.f(i10));
        return null;
    }

    public static Y2.j e(int i10, String str, u uVar, boolean z10, boolean z11) {
        int f6 = f(uVar);
        if (z11) {
            f6 = Math.min(1, f6);
        }
        if (f6 >= 0) {
            if (z10) {
                return new Y2.o(str, null, N.u0(Integer.toString(f6)));
            }
            return new Y2.e("und", str, Integer.toString(f6));
        }
        s2.p.g("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC6266a.f(i10));
        return null;
    }

    public static int f(u uVar) {
        uVar.G(4);
        if (uVar.g() == 1684108385) {
            uVar.G(8);
            return uVar.u();
        }
        s2.p.g("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean g(L2.r rVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        boolean z16;
        long h10 = rVar.h();
        long j6 = -1;
        int i12 = (h10 > (-1L) ? 1 : (h10 == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i12 != 0 && h10 <= 4096) {
            j10 = h10;
        }
        int i13 = (int) j10;
        u uVar = new u(64);
        boolean z17 = false;
        int i14 = 0;
        boolean z18 = false;
        while (i14 < i13) {
            uVar.C(8);
            byte[] bArr = uVar.f45193a;
            int i15 = z17 ? 1 : 0;
            int i16 = z17 ? 1 : 0;
            int i17 = z17 ? 1 : 0;
            int i18 = z17 ? 1 : 0;
            if (!rVar.c(bArr, i15, 8, true)) {
                break;
            }
            long v10 = uVar.v();
            int g10 = uVar.g();
            if (v10 == 1) {
                rVar.n(uVar.f45193a, 8, 8);
                uVar.E(16);
                i10 = 16;
                v10 = uVar.o();
            } else {
                if (v10 == 0) {
                    long h11 = rVar.h();
                    if (h11 != j6) {
                        v10 = (h11 - rVar.d()) + 8;
                    }
                }
                i10 = 8;
            }
            long j11 = i10;
            if (v10 < j11) {
                return z17;
            }
            i14 += i10;
            if (g10 == 1836019574) {
                i13 += (int) v10;
                if (i12 != 0 && i13 > h10) {
                    i13 = (int) h10;
                }
            } else if (g10 == 1836019558 || g10 == 1836475768) {
                z13 = z17;
                z12 = true;
                z14 = true;
                break;
            } else {
                if (g10 == 1835295092) {
                    i11 = i12;
                    z18 = true;
                } else {
                    i11 = i12;
                }
                if ((i14 + v10) - j11 >= i13) {
                    z14 = false;
                    z13 = false;
                    z12 = true;
                    break;
                }
                int i19 = (int) (v10 - j11);
                i14 += i19;
                if (g10 == 1718909296) {
                    if (i19 < 8) {
                        return false;
                    }
                    uVar.C(i19);
                    rVar.n(uVar.f45193a, 0, i19);
                    int i20 = i19 / 4;
                    for (int i21 = 0; i21 < i20; i21++) {
                        if (i21 == 1) {
                            uVar.G(4);
                        } else {
                            int g11 = uVar.g();
                            if ((g11 >>> 8) != 3368816 && (g11 != 1751476579 || !z11)) {
                                int[] iArr = f28866b;
                                for (int i22 = 0; i22 < 29; i22++) {
                                    if (iArr[i22] != g11) {
                                    }
                                }
                                continue;
                            }
                            z16 = true;
                            break;
                        }
                    }
                    z16 = z18;
                    if (!z16) {
                        return false;
                    }
                    z15 = false;
                    z18 = z16;
                } else {
                    z15 = false;
                    if (i19 != 0) {
                        rVar.e(i19);
                    }
                }
                z17 = z15;
                i12 = i11;
            }
            j6 = -1;
        }
        boolean z19 = z17 ? 1 : 0;
        Object[] objArr = z17 ? 1 : 0;
        Object[] objArr2 = z17 ? 1 : 0;
        Object[] objArr3 = z17 ? 1 : 0;
        z13 = z19;
        z12 = true;
        z14 = z13;
        if (!z18 || z10 != z14) {
            return z13;
        }
        return z12;
    }
}
