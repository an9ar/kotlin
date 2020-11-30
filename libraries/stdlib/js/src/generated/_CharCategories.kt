/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

// 1343 ranges totally
private object Category {
    // rangeLength.length = 1482
    internal const val rangeLength = "gBCFEDCKCDCaDDaDBhBCEEDDDDDEDXBHYBH5BRwBGDCHDCIDFHDCHFDCDEIRTEE7BGHDDJlCBbSEMOFGERwDEDDDDECEFCRBJhBFDCYFFCCzBvBjBBFC3BOhDBmBDGpBDDCtBBJIbEECLGDFCLDCgBBKVKEDiDDHCFECECKCEODBebC5CLBOKhBJDDDDWEBHFCFCPBZDEL1BVBSLPBgBB2BDBDICFBHKCCKCPDBHEDWBHEDDDDEDEDIBDGDCKCCGDDDCGECCWBFMDDCDEDDCHDDHKDDBKDBHFCWBFGFDBDDFEDBPDDKCHBGDCHEDWBFGFDCEDEDBHDDGDCKCGJEGDBFDDFDDDDDMEFDBFDCGBOKDFDFDCGFCXBQDDDDDBEGEDFDDKHBHDDGFCXBKBFCEFCFCHCHECCKDNCCHFCoBEDECFDDDDHDCCKJBGDCSDYBJEHBFDDEBIGKDCMuBFHEBGBIBKCkBFBFBXEIFJDFDGCKCEgBBDPEDGKKGECIBkBEOBDFFLBkBBIBEFFEClBrBCEBEGDBKGGDDDDDCHDENDCFEKDDlBDDFrBCDpKBECGEECpBBEChBBECGEECPB5BBECjCCDJUDQKG2CCGDsTCRBaCDrCDDIHNBEDLSDCJSCMLFCCM0BDHGFLBFDDKGKGEFDDBKGjBB1BHFChBDFmCKfDDDDDDCGDCFDKeCFLsBEaGKBDiBXDDD1BDGDEIGJEKGKGHBGCMF/BEBvBCEDDFHEKHKJJDDeDDGDKsBFEDCIEkBIICCDFKDDKeGCJHrBCDIIDBNBHEBEFDBFsB/BNBiBlB6BBF1EIiDJIGCGCIIIIGCGCIIIIOCIIIIIIDFEDDBFEDDDDEBDIFDDFEDBLFGCEEICFBJCDEDCLDKBFBKCCGDDKDDNDgBQNEBDMPFFDEDEBFFHECEBEEDFBEDDQjBCEDEFFCCJHBeEEfsIIEUCHCxCBeZoBGlCZLV8BuCW3FBJB2BIvDB4HOesBFCfKQgIjEW/BEgBCiIwBVCGnBCgBBpDvBBuBEDBHEFGCCjDCGEDCFCFlBDDF4BHCOBXJHBHBHBHBHBHBHBHBgBCECGHGEDIFBKCEDMEtBaB5CM2GaMEDDCKCGFCJEDFDDDC2CDDDB6CDCFrBB+CDEKgBkBMQfBKeIBPgBKnBPgKguGgC9vUDVB3jBD3BJoBGCsIBDQKCUuBDDKCcCCmCKCGIXJCNC/BBHGKDECEVFBEMCEEBqBDDGDFDXDCEBDGEG0BEICyBQCICKGSGDEBKcICXLCLBdDDBvBDECCDNCKECFCJKFBpBFEDCJDBICCKCEQBGDDByBEDCEFBYDCLEDDCKGCGCGJHBHBrBBEJDEwCjBIDCKGk9KMXExBEggCgoGuLCqDmBHMFFCKBNBFBIsDQRrLCQgCC2BoBMCCQGEGQDCQDDDDFDGDECEEFBnEEBFEDCKCDCaDDaDBFCKBtBCfDGCGCFEDDDDCECKDC"

    // rangeCategory.length = 2033
    internal const val rangeCategory = "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"

    internal val decodedRangeStart: IntArray
    internal val decodedRangeCategory: IntArray
    
    init {
        val toBase64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        val fromBase64 = IntArray(128)
        for (i in toBase64.indices) {
            fromBase64[toBase64[i].toInt()] = i
        }
        val length = decodeVarLenBase64(rangeLength, fromBase64, 1342)
        val start = IntArray(length.size + 1)
        for (i in length.indices) {
            start[i + 1] = start[i] + length[i]
        }
        decodedRangeStart = start
        decodedRangeCategory = decodeVarLenBase64(rangeCategory, fromBase64, 1343)
    }
}

private fun categoryValueFrom(code: Int, ch: Int): Int {
    return when {
        code < 0x20 -> code
        code < 0x400 -> if ((ch and 1) == 1) code shr 5 else code and 0x1f
        else ->
            when (ch % 3) {
                2 -> code shr 10
                1 -> (code shr 5) and 0x1f
                else -> code and 0x1f
            }
    }
}

/**
 * Returns the Unicode general category of this character as an Int.
 */
internal fun Char.getCategoryValue(): Int {
    val ch = this.toInt()

    val index = binarySearchRange(Category.decodedRangeStart, ch)
    val code = Category.decodedRangeCategory[index]
    val value = categoryValueFrom(code, ch)

    return if (value == 17) CharCategory.UNASSIGNED.value else value
}

internal fun decodeVarLenBase64(base64: String, fromBase64: IntArray, resultLength: Int): IntArray {
    val result = IntArray(resultLength)
    var index = 0
    var int = 0
    var shift = 0
    for (char in base64) {
        val sixBit = fromBase64[char.toInt()]
        int = int or ((sixBit and 0x1f) shl shift)
        if (sixBit < 0x20) {
            result[index++] = int
            int = 0
            shift = 0
        } else {
            shift += 5
        }
    }
    return result
}
